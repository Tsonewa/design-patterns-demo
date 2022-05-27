package AbstractFactoryPattern;


public abstract class Factory {

    public Cpu assembleGpu(){
        Cpu cpu = createGpu();
        cpu.assemble();
        return cpu;
    }

    public Monitor assembleMonitor(){
        Monitor monitor = createMonitor();
        monitor.assemble();
        return monitor;
    }

    public abstract Cpu createGpu();

    public abstract Monitor createMonitor();

}
