    import org.testng.annotations.*;
    public class TestNgAnnotations {
	
	

	    @BeforeClass
	    public void setUpClass() {
	        System.out.println("BeforeClass: Open Browser once");
	    }

	    @BeforeMethod
	    public void setUpMethod() {
	        System.out.println("BeforeMethod: Login before each test");
	    }

	    @Test
	    public void test1() {
	        System.out.println("Executing Test1");
	    }

	    @Test
	    public void test2() {
	        System.out.println("Executing Test2");
	    }

	    @AfterMethod
	    public void tearDownMethod() {
	        System.out.println("AfterMethod: Logout after each test");
	    }

	    @AfterClass
	    public void tearDownClass() {
	        System.out.println("AfterClass: Close Browser once");
	    
	}}


