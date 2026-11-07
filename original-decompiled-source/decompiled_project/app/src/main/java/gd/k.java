package gd;

import gd.l;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final class k<T_WRAPPER extends l<JcePrimitiveT>, JcePrimitiveT> {

    /* renamed from: b, reason: collision with root package name */
    public static final k<l.a, Cipher> f11974b = new k<>(new l.a());

    /* renamed from: c, reason: collision with root package name */
    public static final k<l.e, Mac> f11975c = new k<>(new l.e());

    /* renamed from: a, reason: collision with root package name */
    public final d<JcePrimitiveT> f11976a;

    public static class a<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        public final l<JcePrimitiveT> f11977a;

        public a(l lVar) {
            this.f11977a = lVar;
        }

        @Override // gd.k.d
        public final JcePrimitiveT a(String str) throws GeneralSecurityException {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i11 < 2; i11++) {
                Provider provider = Security.getProvider(strArr[i11]);
                if (provider != null) {
                    arrayList.add(provider);
                }
            }
            int size = arrayList.size();
            Exception exc = null;
            while (true) {
                l<JcePrimitiveT> lVar = this.f11977a;
                if (i10 >= size) {
                    return lVar.a(str, null);
                }
                Object obj = arrayList.get(i10);
                i10++;
                try {
                    return lVar.a(str, (Provider) obj);
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
        }
    }

    public static class b<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        public final l<JcePrimitiveT> f11978a;

        public b(l lVar) {
            this.f11978a = lVar;
        }

        @Override // gd.k.d
        public final JcePrimitiveT a(String str) throws GeneralSecurityException {
            return this.f11978a.a(str, null);
        }
    }

    public static class c<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        public final l<JcePrimitiveT> f11979a;

        public c(l lVar) {
            this.f11979a = lVar;
        }

        @Override // gd.k.d
        public final JcePrimitiveT a(String str) throws GeneralSecurityException {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                Provider provider = Security.getProvider(strArr[i11]);
                if (provider != null) {
                    arrayList.add(provider);
                }
            }
            int size = arrayList.size();
            Exception exc = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                try {
                    return this.f11979a.a(str, (Provider) obj);
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    public interface d<JcePrimitiveT> {
        JcePrimitiveT a(String str) throws GeneralSecurityException;
    }

    static {
        new k(new l.g());
        new k(new l.f());
        new k(new l.b());
        new k(new l.d());
        new k(new l.c());
    }

    public k(T_WRAPPER t_wrapper) {
        if (wc.a.a()) {
            this.f11976a = new c(t_wrapper);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f11976a = new a(t_wrapper);
        } else {
            this.f11976a = new b(t_wrapper);
        }
    }
}
