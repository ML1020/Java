package Demo.MapDemo;
public class HashMap<K, V> implements Map<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // 16 就是 2 的 n 次方
    private Entry<K, V>[] table = new Entry[16];
    private int size = 0;
    private static final double LOAD_FACTOR_THRESHOLD = 0.75;

    @Override
    public V get(K key) {
        // key => index
        int hash = key.hashCode();      // 这里调用了 key 的 hashCode()
        hash = (hash >>> 16) ^ hash;
        int index = hash & (table.length  - 1);
        // index => 链表（取到的是头结点）
        Entry<K, V> head = table[index];
        // 在链表中查找
        Entry<K, V> node = head;
        while (node != null) {
            if (key.equals(node.key)) { // 这里调用了 key 的 equals()
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        // key => index
        int hash = key.hashCode();      // 这里调用了 key 的 hashCode()
        hash = (hash >>> 16) ^ hash;
        int index = hash & (table.length  - 1);
        // index => 链表（取到的是头结点）
        //index为数组的下标，head为此下标的下面链表头结点
        Entry<K, V> head = table[index];
        // 在链表中查找
        Entry<K, V> node = head;
        while (node != null) {
            //如果key在链表中已存在，则替换为新value
            if (key.equals(node.key)) { // 这里调用了 key 的 equals()
                V oldValue = node.value;
                node.value = value;
                return oldValue;
            }
            node = node.next;
        }

        // 没有找到，所以插入结点
        Entry<K, V> newNode = new Entry<>(key, value);
        // 头插 or 尾插都可以

        /** 头插
        newNode.next = head;
        table[index] = newNode;
        //*/

        //** 尾插
        if (head == null) {
            table[index] = newNode;
        } else {
            Entry<K, V> last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }

        size++;

        // 通过调整负载因子，来控制冲突率
        if ((double)size / table.length >= LOAD_FACTOR_THRESHOLD) {
            // 扩容
            resize();
        }

        return null;
    }

    /**
     * 需要把所有的 key 重新计算 hash，重新进行插入
     */
    private void resize() {
        // 保证新的长度也是 2 的 n 次方
        Entry<K, V>[] newTable = new Entry[table.length * 2];

        // 遍历所有的 key
        // 首先遍历所有的下标位置，找到一条条的链表
        // 再次遍历每个链表，找到一个个的 key
        for (int i = 0; i < table.length; i++) {
            Entry<K, V> node = table[i];
            while (node != null) {
                // 为了简化，重新创建新结点
                Entry<K, V> newNode = new Entry<>(node.key, node.value);
                int hash = node.key.hashCode();
                hash = (hash >>> 16) ^ hash;
                int index = hash & (newTable.length - 1);   // 这里是新数组
                // 使用头插，简单一点
                newNode.next = newTable[index];
                newTable[index] = newNode;

                node = node.next;
            }
        }
    }
}
