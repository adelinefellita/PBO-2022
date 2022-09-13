public class kubus {
    int sisiKubus = 5;

    public Double hitungVolume() {
        Double volume = 0.0 + this.sisiKubus * this.sisiKubus * this.sisiKubus;
        return volume;
    }
    
    public Double hitungLuasPermukaan(){
        int luasPermukaan = 0;
        int luasPermukaan = 6 * this.sisiKubus * this.sisiKubus;
        return luasPermukaan;
    }

    public static void main(String[] args){
        kubus kubus = new kubus();
        
        System.out.println("Sisi Kubus : "+kubus.sisiKubus);
        System.out.println("Volume Kubus : "+kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus : "+kubus.hitungLuasPermukaan());
    }
}