package builder;
/*
* Builder Design Pattern
*
* This pattern is mainly used when we want to create an object after validating the input details
* that the user is sending.
*
* */
public final class Computer {
    private final String cpu;

    private final int ram;
    private final int storageGb;
    private final String gpuModel;
    private final boolean wifiEnabled;
/*
* The constructor that we used below is declared private so that anyone outside this class
* can't create its object
*
* we pass in builder object b which is after validating the details
* */
    private Computer(Builder b){
        this.cpu = b.cpu;
        this.ram = b.ram;
        this.storageGb = b.storageGb;
        this.gpuModel = b.gpuModel;
        this.wifiEnabled = b.wifiEnabled;
    }
/*
* we use nested class builder to collect the details from user and validate them
* before passing them onto main class
* */
    public static class Builder{
        private final String cpu;

        private Integer ram = 8;
        private Integer storageGb = 256;
        private String gpuModel = null;
        private boolean wifiEnabled = true;

        public Builder(String cpu){
            this.cpu = cpu;
        }

        public Builder ram(int ram){
            this.ram = ram;
            return this;
        }

        public Builder storageGb(int storageGb){
            this.storageGb = storageGb;
            return this;
        }

        public Builder gpuModel(String gpuModel){
            this.gpuModel = gpuModel;
            return this;
        }

        public Builder wifiEnabled(boolean wifiEnabled){
            this.wifiEnabled = wifiEnabled;
            return this;
        }

/*
* we use the below build class to validate the inputs received and then we pass on
* builder object to private construct of computer
* */

        public Computer build(){
            if (this.cpu == null || this.cpu.isBlank()){
                throw new IllegalArgumentException("cpu required");
            }
            if(ram != null && ram < 1){
                throw new IllegalArgumentException("ram should be a positive integer");
            }
            if(storageGb != null && storageGb < 64){
                throw new IllegalArgumentException("storageGb too small");
            }

            return new Computer(this);
        }
    }

/*
* These are getters so that users would be able to access private variables and
* not modify them.
* */
    public String getCpu(){
        return cpu;
    }
    public Integer getRam(){
        return ram;
    }
    public Integer getStorageGb(){
        return storageGb;
    }
    public String getGpuModel(){
        return gpuModel;
    }
}
