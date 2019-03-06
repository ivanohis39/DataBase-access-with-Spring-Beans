package supremo.model;

import java.sql.Date;

public class Empleados {

	private int emp_no;
	private String apellido;
	private String oficio;
	private int dir;
	private Date fecha_alt;
	private double salario;
	private double comision;
	private int dept_no;

	public Empleados() {
		super();
	}

	public Empleados(int emp_no) {
		super();
		this.emp_no = emp_no;
	}

	public Empleados(int emp_no, String apellido, double salario, int dept_no) {
		super();
		this.emp_no = emp_no;
		this.apellido = apellido;
		this.salario = salario;
		this.dept_no = dept_no;
	}

	public Empleados(int emp_no, String apellido, String oficio, int dir, Date fecha_alt, double salario,
			double comision, int dept_no) {
		super();
		this.emp_no = emp_no;
		this.apellido = apellido;
		this.oficio = oficio;
		this.dir = dir;
		this.fecha_alt = fecha_alt;
		this.salario = salario;
		this.comision = comision;
		this.dept_no = dept_no;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public Date getFecha_alt() {
		return fecha_alt;
	}

	public void setFecha_alt(Date fecha_alt) {
		this.fecha_alt = fecha_alt;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	@Override
	public String toString() {
		return "Empleados [emp_no=" + emp_no + ", apellido=" + apellido + ", oficio=" + oficio + ", dir=" + dir
				+ ", fecha_alt=" + fecha_alt + ", salario=" + salario + ", comision=" + comision + ", dept_no="
				+ dept_no + "]";
	}

}