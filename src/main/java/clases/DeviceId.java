package clases;
// Generated 20-ene-2020 16:15:15 by Hibernate Tools 4.3.1.Final

/**
 * DeviceId generated by hbm2java
 */
public class DeviceId implements java.io.Serializable {

	private int deviceId;
	private String name;

	public DeviceId() {
	}

	public DeviceId(int deviceId, String name) {
		this.deviceId = deviceId;
		this.name = name;
	}

	public int getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DeviceId))
			return false;
		DeviceId castOther = (DeviceId) other;

		return (this.getDeviceId() == castOther.getDeviceId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getDeviceId();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}
