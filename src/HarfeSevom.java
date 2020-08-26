public class HarfeSevom extends Valed{
    public void sevom(){
        String string=new String();
        string=esm();

        System.out.println("harfe sevom hasat: "+String.valueOf(string.charAt(2)));
    }

    @Override
    protected void moarefi() {
        super.moarefi();
        System.out.println("man class harfe sevom hastam");
    }
}
