public class Results {
    private String funcionName;
    private long duration;
    private String sample;


    public Results() {
    }
    public Results(String funcionName, long duration, String sample) {
        this.funcionName = funcionName;
        this.duration = duration;
        this.sample = sample;
    }
    public String getFuncionName() {
        return funcionName;
    }
    public void setFuncionName(String funcionName) {
        this.funcionName = funcionName;
    }
    public long getDuration() {
        return duration;
    }
    public void setDuration(long duration) {
        this.duration = duration;
    }
    public String getSample() {
        return sample;
    }
    public void setSample(String sample) {
        this.sample = sample;
    }
    @Override
    public String toString() {
        long segundos = duration/1_000_000_000;
        return "Results [funcionName: " + funcionName + " , duration: " + duration + " ns, "+ segundos + " sample: " + sample + "]";
    }
    
}
