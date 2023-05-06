public class ModernUiAdapter implements AppServer {

    private final ModernAppUi modernAppUi;

    public ModernUiAdapter(ModernAppUi modernAppUi) {
        this.modernAppUi = modernAppUi;
    }

    @Override
    public void displayData(XMLData xmlData) {
        JasonData data = convertor(xmlData);
        modernAppUi.displayData(data);
    }
    private JasonData convertor(XMLData data){
        //business logic
        return new JasonData();
    }
}
