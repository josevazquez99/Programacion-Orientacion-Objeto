package Producto;

public class MainProducto {

	public static void main(String[] args) {
		Producto p=new Producto("PSP",190);
		System.out.println(p.getDescripcion());
		System.out.println(p.calcularPrecioVenta());
		System.out.println(p.toString());
	}

}
