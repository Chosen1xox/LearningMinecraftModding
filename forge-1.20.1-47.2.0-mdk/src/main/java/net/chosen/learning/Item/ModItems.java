public class ModItems
{
    public static final DefferedRegister<Item> ITEMS = DefferedRegister.create(ForgeRegisteries.ITEMS, Learning.MOD.ID);

    public staticfinal RegisteryObject<Item> ZIRCON = ITEMS.register(bus: "zircon", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}