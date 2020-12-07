package Liskov;

class Helicopter extends Aircraft {
    public void setSpeed(int speed) {
        m_speed = speed;
        m_altitude = speed;
    }

    public void setAltitude(int altitude) {
        m_speed = altitude;
        m_altitude = altitude;
    }
}

