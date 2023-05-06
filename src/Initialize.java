public class Initialize {
    public static void main(String[] args) {
        AppServer legacyUi = new LegacyAppUI();
        legacyUi.displayData(new XMLData());
        //-----
        AppServer modernUi = new ModernUiAdapter(
                new ModernAppUi()
        );
        modernUi.displayData(new XMLData());
    }
}
