package fcu.iecs.oop.tiida;

public class NissanTiida {
	private int frequency;
	public NissanTiida(){
		frequency=1;
	}
	public void tiida(){
		int i,j;
		for(i=1;i<=frequency;i++)
		{
			for(j=1;j<=frequency;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		this.frequency++;
	}
}
