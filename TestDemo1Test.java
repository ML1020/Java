import org.junit.*;

import static org.junit.Assert.*;

public class TestDemo1Test {

    @BeforeClass  //运行所有测试用例之前，要是静态方法
    public static void beforeclass(){
        System.out.println("=======BeforeClass");
    }
    @AfterClass  //运行所有测试用例之后，必须为静态方法
    public static void afterclass(){
        System.out.println("=======AfterClass");
    }
    //执行测试用例之前
    @Before
    public void before(){
        System.out.println("=====qian");
    }
    //执行测试用例之后
    @After
    public void after(){
        System.out.println("=====hou");
    }
    @Test
    public void add() {
        TestDemo1 a = new TestDemo1();
        int res = a.add(10,20);
        System.out.println(res);
    }

    @Test
    public void add1() {
        TestDemo1 a = new TestDemo1();
        System.out.println("初始化完成");
        int res = a.add(10,TestDemo1.a);
        TestDemo1.a++;
        System.out.println(TestDemo1.a);
        System.out.println(res);
        //断言
        //此处 0 代表的是误差值，
        //当expect与result相差的绝对值小于这个值时测试通过。但大于等于时会失败。
        assertEquals(11,res,0);//期望值是否与结果相等
        System.out.println(res);
    }
}