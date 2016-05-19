package co.runcode.dm.idm;

import javax.persistence.Entity;
import org.picketlink.idm.credential.storage.OTPCredentialStorage;
import org.picketlink.idm.jpa.annotations.CredentialProperty;
import org.picketlink.idm.jpa.annotations.entity.ManagedCredential;

/**
 * <p>This entity is mapped to support OTP credential types using a {@link org.picketlink.idm.credential.storage.OTPCredentialStorage}.</p>
 *
 * @author pedroigor
 */
@ManagedCredential (OTPCredentialStorage.class)
@Entity
public class OTPCredentialTypeEntity extends AbstractCredentialTypeEntity {

    private static final long serialVersionUID = 2178549213245407363L;

    @CredentialProperty (name = "secretKey")
    private String totpSecretKey;

    @CredentialProperty (name = "device")
    private String totpDevice;

    public String getTotpSecretKey() {
        return totpSecretKey;
    }

    public void setTotpSecretKey(String totpSecretKey) {
        this.totpSecretKey = totpSecretKey;
    }

    public String getTotpDevice() {
        return totpDevice;
    }

    public void setTotpDevice(String totpDevice) {
        this.totpDevice = totpDevice;
    }
}
