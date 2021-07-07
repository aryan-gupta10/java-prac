package comparatorDemoWithoutAndWithUsingLambdaPckg;

public class Employee
{
	private String empName;
	private long jobExp;
	
	public Employee(String empName, long jobExp)
	{
		super();
		this.empName = empName;
		this.jobExp = jobExp;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public long getJobExp()
	{
		return jobExp;
	}
	public void setJobExp(long jobExp)
	{
		this.jobExp = jobExp;
	}

	@Override
	public String toString()
	{
		return "Employee [empName=" + empName + ", jobExp=" + jobExp + "]";
	}
}
