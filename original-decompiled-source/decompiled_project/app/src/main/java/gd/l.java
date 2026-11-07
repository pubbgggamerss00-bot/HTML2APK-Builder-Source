package gd;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public interface l<T> {

    public static class a implements l<Cipher> {
        @Override // gd.l
        public final Cipher a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    public static class b implements l<KeyAgreement> {
        @Override // gd.l
        public final KeyAgreement a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
        }
    }

    public static class c implements l<KeyFactory> {
        @Override // gd.l
        public final KeyFactory a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
        }
    }

    public static class d implements l<KeyPairGenerator> {
        @Override // gd.l
        public final KeyPairGenerator a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
        }
    }

    public static class e implements l<Mac> {
        @Override // gd.l
        public final Mac a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    public static class f implements l<MessageDigest> {
        @Override // gd.l
        public final MessageDigest a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    public static class g implements l<Signature> {
        @Override // gd.l
        public final Signature a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    T a(String str, Provider provider) throws GeneralSecurityException;
}
