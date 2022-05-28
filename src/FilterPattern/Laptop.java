package FilterPattern;

public class Laptop {

    private String hardDisk;
    private String processor;

    public Laptop(String hardDisk, String processor) {
        this.hardDisk = hardDisk;
        this.processor = processor;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public Laptop setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    public String getProcessor() {
        return processor;
    }

    public Laptop setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
}
