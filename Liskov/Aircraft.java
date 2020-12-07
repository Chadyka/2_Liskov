package Liskov;

public class Aircraft {
    protected int m_speed;
    protected int m_altitude;

    public void setSpeed(int speed) {
        m_speed = speed;
    }

    public void setAltitude(int altitude) {
        m_altitude = altitude;
    }

    public int getDropSpeed() {
        return m_speed * m_altitude;
    }
}