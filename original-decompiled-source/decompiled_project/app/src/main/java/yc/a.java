package yc;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import d4.p;
import ed.f0;
import ed.i0;
import ed.j0;
import ed.z;
import gd.m;
import i8.n;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import sc.h;
import sc.j;
import sc.k;
import sc.t;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f34371b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final k f34372a;

    /* renamed from: yc.a$a, reason: collision with other inner class name */
    public static final class C0348a {

        /* renamed from: a, reason: collision with root package name */
        public Context f34373a = null;

        /* renamed from: b, reason: collision with root package name */
        public String f34374b = null;

        /* renamed from: c, reason: collision with root package name */
        public String f34375c = null;

        /* renamed from: d, reason: collision with root package name */
        public String f34376d = null;

        /* renamed from: e, reason: collision with root package name */
        public b f34377e = null;

        /* renamed from: f, reason: collision with root package name */
        public h f34378f = null;

        /* renamed from: g, reason: collision with root package name */
        public k f34379g;

        public static byte[] c(Context context, String str, String str2) throws IOException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return m.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(n.d("can't read keyset; the pref value ", str, " is not a valid hex string"));
            }
        }

        public static k d(byte[] bArr) throws GeneralSecurityException, IOException {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                i0 i0VarD = i0.D(byteArrayInputStream, o.a());
                byteArrayInputStream.close();
                return new k(j.a(i0VarD).f24809a.u());
            } catch (Throwable th2) {
                byteArrayInputStream.close();
                throw th2;
            }
        }

        public final synchronized a a() throws GeneralSecurityException, IOException {
            a aVar;
            try {
                if (this.f34374b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (a.f34371b) {
                    try {
                        byte[] bArrC = c(this.f34373a, this.f34374b, this.f34375c);
                        if (bArrC == null) {
                            if (this.f34376d != null) {
                                this.f34377e = f();
                            }
                            this.f34379g = b();
                        } else if (this.f34376d != null) {
                            this.f34379g = e(bArrC);
                        } else {
                            this.f34379g = d(bArrC);
                        }
                        aVar = new a(this);
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return aVar;
        }

        public final k b() throws GeneralSecurityException, InterruptedException, IOException {
            if (this.f34378f == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            k kVar = new k(i0.C());
            h hVar = this.f34378f;
            synchronized (kVar) {
                kVar.a(hVar.f24805a);
            }
            int iA = t.a(kVar.c().f24809a).y().A();
            synchronized (kVar) {
                for (int i10 = 0; i10 < ((i0) kVar.f24813a.f6808b).z(); i10++) {
                    i0.b bVarY = ((i0) kVar.f24813a.f6808b).y(i10);
                    if (bVarY.B() == iA) {
                        if (!bVarY.D().equals(f0.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iA);
                        }
                        i0.a aVar = kVar.f24813a;
                        aVar.e();
                        i0.w((i0) aVar.f6808b, iA);
                    }
                }
                throw new GeneralSecurityException("key not found: " + iA);
            }
            Context context = this.f34373a;
            String str = this.f34374b;
            String str2 = this.f34375c;
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
            if (this.f34377e != null) {
                j jVarC = kVar.c();
                b bVar = this.f34377e;
                byte[] bArr = new byte[0];
                i0 i0Var = jVarC.f24809a;
                byte[] bArrA = bVar.a(i0Var.toByteArray(), bArr);
                try {
                    if (!i0.E(bVar.decrypt(bArrA, bArr), o.a()).equals(i0Var)) {
                        throw new GeneralSecurityException("cannot encrypt keyset");
                    }
                    z.a aVarZ = z.z();
                    h.f fVarC = com.google.crypto.tink.shaded.protobuf.h.c(0, bArrA.length, bArrA);
                    aVarZ.e();
                    z.w((z) aVarZ.f6808b, fVarC);
                    j0 j0VarA = t.a(i0Var);
                    aVarZ.e();
                    z.x((z) aVarZ.f6808b, j0VarA);
                    if (!editorEdit.putString(str, m.b(aVarZ.b().toByteArray())).commit()) {
                        throw new IOException("Failed to write to SharedPreferences");
                    }
                } catch (com.google.crypto.tink.shaded.protobuf.z unused) {
                    throw new GeneralSecurityException("invalid keyset, corrupted key material");
                }
            } else if (!editorEdit.putString(str, m.b(kVar.c().f24809a.toByteArray())).commit()) {
                throw new IOException("Failed to write to SharedPreferences");
            }
            return kVar;
        }

        public final k e(byte[] bArr) throws GeneralSecurityException, IOException {
            try {
                this.f34377e = new c().b(this.f34376d);
                try {
                    return new k(j.c(new p(new ByteArrayInputStream(bArr)), this.f34377e).f24809a.u());
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return d(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    k kVarD = d(bArr);
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e11);
                    return kVarD;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        public final b f() throws GeneralSecurityException {
            c cVar = new c();
            try {
                boolean zC = c.c(this.f34376d);
                try {
                    return cVar.b(this.f34376d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!zC) {
                        throw new KeyStoreException(n.d("the master key ", this.f34376d, " exists but is unusable"), e10);
                    }
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public final void g(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            this.f34376d = str;
        }

        public final void h(Context context, String str, String str2) throws IOException {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f34373a = context;
            this.f34374b = str;
            this.f34375c = str2;
        }
    }

    public a(C0348a c0348a) {
        Context context = c0348a.f34373a;
        String str = c0348a.f34374b;
        String str2 = c0348a.f34375c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f34372a = c0348a.f34379g;
    }
}
