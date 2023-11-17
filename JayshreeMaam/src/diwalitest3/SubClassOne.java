package diwalitest3;

public class SubClassOne extends SuperClassOne{

	static
    {
        System.out.println(super.i);
        this.methodTwo();	
     }

}
