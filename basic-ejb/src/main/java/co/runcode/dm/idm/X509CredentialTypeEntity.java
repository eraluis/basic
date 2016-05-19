package co.runcode.dm.idm;

import javax.persistence.Column;
import javax.persistence.Entity;
import org.picketlink.idm.credential.storage.X509CertificateStorage;
import org.picketlink.idm.jpa.annotations.CredentialProperty;
import org.picketlink.idm.jpa.annotations.entity.ManagedCredential;

/**
 * <p>This entity is mapped to support X509 credential types using a {@link X509CertificateStorage}.</p>
 *
 * @author pedroigor
 */
@ManagedCredential (X509CertificateStorage.class)
@Entity
public class X509CredentialTypeEntity extends AbstractCredentialTypeEntity {

    private static final long serialVersionUID = -8313462190592256324L;

    @CredentialProperty
    @Column(length = 1024)
    private String base64Cert;

    public String getBase64Cert() {
        return base64Cert;
    }

    public void setBase64Cert(String base64Cert) {
        this.base64Cert = base64Cert;
    }
}
