package co.com.choucair.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FalabellaData extends PageObject {


    public static final Target BUTTON_NO = Target.the("Selecciona el boton no")
            .located(By.xpath("/html/body/div[2]//div/div/div[3]/button[1]"));
    public static final Target BUTTON_CATEGORIAS = Target.the("Selecciona el boton Categorias")
            .located(By.xpath("//*[@id=\"testId-HamburgerBtn-toggle\"]/div[1]/div/span"));
    public static final Target BUTTON_SUBCATEGORIAS = Target.the("Selecciona el boton SubCategorias")
            .located(By.xpath("//*[@id=\"cross-header\"]/div[3]/div/div[2]/div/ul/li[2]/div/p"));
    public static final Target BUTTON_MENU_SUBCATEGORIAS = Target.the("Selecciona el boton del menu de SubCategorias")
            .located(By.id("testId-ThirdLevelMenu-link"));
    public static final Target SELECCIONAR_PRODUCTO = Target.the("Selecciona el producto")
            .located(By.id("testId-pod-displaySubTitle-prod12540007"));
    public static final Target BUTON_AGREGAR_A_LA_BOLSA = Target.the("Selecciona el boton agregar a la bolsa")
            .located(By.id("buttonForCustomers"));
    public static final Target BUTON_BOLSA_DE_COMPRA = Target.the("Selecciona el boton bolsa de compra")
            .located(By.id("linkButton"));
    public static final Target BUTON_IR_A_COMPRAR = Target.the("Selecciona el boton ir a comprar")
            .located(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/button"));
    public static final Target BUTON_REGION = Target.the("Selecciona el boton REGION")
            .located(By.id("region"));
    public static final Target BUTON_DEPARTAMENTO = Target.the("Selecciona el departamento")
            .located(By.xpath("//*[@id=\"region\"]/option[2]"));
    public static final Target BUTON_CIUDAD = Target.the("Selecciona el boton ciudad")
            .located(By.id("ciudad"));
    public static final Target BOTON_SELECCIONAR_CIUDAD = Target.the("Selecciona la ciudad")
            .located(By.xpath("//*[@id=\"ciudad\"]/option[40]"));
    public static final Target BOTON_COMUNA = Target.the("Selecciona la comuna")
            .located(By.id("comuna"));
    public static final Target BOTON_SELECCIONAR_COMUNA = Target.the("Selecciona la comuna")
            .located(By.xpath("//*[@id=\"comuna\"]/option[2]"));
    public static final Target BOTON_CONTINUAR = Target.the("Selecciona boton continuar")
            .located(By.xpath("//*[@id=\"fbra_checkoutRegionAndComuna\"]/div/section/section/form/div/div[4]/div/button"));
    public static final Target DIRECCION = Target.the("Digito la direccion")
            .located(By.id("address"));
    public static final Target APARTAMENTO = Target.the("DIgito el apartamento")
            .located(By.id("departmentNumber"));
    public static final Target BOTON_INGRESAR_DIRECCION = Target.the("DIgito el apartamento")
            .located(By.xpath("//*[@id=\"fbra_checkoutDeliverAndCollect\"]/div/div/div[1]/div/div[2]/div/div/form/section/div/div[4]/button"));
    public static final Target CONTINUAR = Target.the("Selecciona el boton continuar")
            .located(By.xpath("//*[@id=\"fbra_checkoutDeliveryActions\"]/div/div/span/div/div/div/div[2]/button"));
    public static final Target OTRAS_TARJETAS_CREDITO = Target.the("Selecciona la opcion otras tarjetas de credito")
            .located(By.xpath("//*[@id=\"fbra_checkoutPaymentOptions\"]/div/div/div[1]/div[3]/div/div/div[1]/span"));
    public static final Target MEDIO_SELECCIONADO = Target.the("Selecciono el boton continuar con el medio de pago seleccionado")
            .located(By.xpath("//*[@id=\"fbra_checkoutPaymentOptions\"]/div/div/div[2]/div/section/div/section/div[2]/a[1]"));
    public static final Target NOMRE_TARJETA = Target.the("Digito el nombre de la tarjeta")
            .located(By.id("nameOnCard"));
    public static final Target NUMERO_TARJETA = Target.the("Digito el numero de la tarjeta")
            .located(By.id("cardNumber"));
    public static final Target CVV_TARJETA = Target.the("Digito el codigo cvv de la tarjeta")
            .located(By.id("cardCvv"));
    public static final Target MES = Target.the("Selecciono la opcion mes")
            .located(By.id("expirationMonth"));
    public static final Target SELECCIONO_MES = Target.the("Selecciono el mes")
            .located(By.xpath("//*[@id=\"expirationMonth\"]/option[8]"));
    public static final Target ANIO = Target.the("Selecciono la opcion anio")
            .located(By.id("expirationYear"));
    public static final Target SELECCIONO_ANIO = Target.the("Selecciono el anio")
            .located(By.xpath("//*[@id=\"expirationYear\"]/option[4]"));
    public static final Target BOTON_USAR_ESTA_TARJETA = Target.the("Selecciono el boton usar esta tarjeta")
            .located(By.xpath("//*[@id=\"fbra_checkoutPaymentOptions\"]/div/div/div[1]/div[3]/div/div[2]/section/div/div/form/div[6]/button"));
    public static final Target NOMBRE = Target.the("Ingreso el nombre")
            .located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("Ingreso el apellido")
            .located(By.id("lastName"));
    public static final Target CORREO = Target.the("Ingreso el correo ")
            .located(By.id("emailAddress"));
    public static final Target CEDULA = Target.the("Ingreso # CC")
            .located(By.id("userIdNumber"));
    public static final Target CELULAR = Target.the("Ingreso # Celular")
            .located(By.id("phoneNumber"));
    public static final Target TERMINOS_CONDICIONES = Target.the("Selecciono el check de TyC")
            .located(By.xpath("//*[@id=\"fbra_checkoutConfirmYourOrder\"]/div/div/div/div/section/div[1]/div/div/div/div/label/span/span"));
    public static final Target INGRESAR_ORDEN = Target.the("Selecciono el boton ingresar orden")
            .located(By.xpath("//*[@id=\"fbra_checkoutConfirmYourOrder\"]/div/div/div/div/section/div[1]/button"));
    public static final Target CONFIRMACION = Target.the("Mensaje de confirmacion")
            .located(By.xpath("//*[@id=\"fbra_notifications\"]/div/div/div/div/section/div/section/div/p[1]/text()[1]"));

    //*[@id="fbra_checkoutConfirmYourOrder"]/div/div/div/div/section/div[1]/div/div/div/div/label/span/span
    //*[@id="fbra_checkoutConfirmYourOrder"]/div/div/div/div/section/div[1]/div/div/div/div/label/span

    //*[@id="fbra_checkoutConfirmYourOrder"]/div/div/div/div/section/div[1]/button
    //*[@id="fbra_checkoutConfirmYourOrder"]/div/div/div/div/section/div[1]/button

}
