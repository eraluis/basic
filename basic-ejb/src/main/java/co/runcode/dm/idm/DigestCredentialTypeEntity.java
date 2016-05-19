package co.runcode.dm.idm;

import javax.persistence.Entity;
import org.picketlink.idm.credential.storage.DigestCredentialStorage;
import org.picketlink.idm.jpa.annotations.CredentialProperty;
import org.picketlink.idm.jpa.annotations.entity.ManagedCredential;

/**
 * <p>This entity is mapped to support DIGEST credential types using a {@link org.picketlink.idm.credential.storage.DigestCredentialStorage}.</p>
 *
 * @author pedroigor
 */
@ManagedCredential (DigestCredentialStorage.class)
@Entity
public class DigestCredentialTypeEntity extends AbstractCredentialTypeEntity {

    private static final long serialVersionUID = 8582138093637065019L;

    @CredentialProperty (name = "realm")
    private String digestRealm;

    @CredentialProperty (name = "ha1")
    private byte[] digestHa1;

    public String getDigestRealm() {
        return digestRealm;
    }

    public void setDigestRealm(String digestRealm) {
        this.digestRealm = digestRealm;
    }

    public byte[] getDigestHa1() {
        return digestHa1;
    }

    public void setDigestHa1(byte[] digestHa1) {
        this.digestHa1 = digestHa1;
    }
}
