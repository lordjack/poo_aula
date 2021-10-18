package slides.slide10;

public class Besteirol {
    public void fazBesteira() {
        Lavanderia lavanderia = new Lavanderia();
        try {
            lavanderia.lavar();
            System.out.println(5 / 0);
        } catch (ExcecaoCalca ex) {
            // código de recuperação
            System.out.println(ex.getMessage());
        } catch (ExcecaoCamisa ex) {
            // código de recuperação
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            // código de recuperação
            System.out.println(ex.getMessage());
        }
    }
}
