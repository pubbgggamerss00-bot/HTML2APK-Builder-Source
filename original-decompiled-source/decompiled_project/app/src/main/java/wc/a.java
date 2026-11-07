package wc;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f31488a = Logger.getLogger(a.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f31489b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: wc.a$a, reason: collision with other inner class name */
    public static abstract class EnumC0318a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0319a f31490a;

        /* renamed from: b, reason: collision with root package name */
        public static final b f31491b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumC0318a[] f31492c;

        /* renamed from: wc.a$a$a, reason: collision with other inner class name */
        public enum C0319a extends EnumC0318a {
            public C0319a() {
                super("ALGORITHM_NOT_FIPS", 0);
            }

            @Override // wc.a.EnumC0318a
            public final boolean a() {
                return !a.a();
            }
        }

        /* renamed from: wc.a$a$b */
        public enum b extends EnumC0318a {
            public b() {
                super("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            }

            @Override // wc.a.EnumC0318a
            public final boolean a() {
                Boolean bool;
                if (a.a()) {
                    try {
                        bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                    } catch (Exception unused) {
                        a.f31488a.info("Conscrypt is not available or does not support checking for FIPS build.");
                        bool = Boolean.FALSE;
                    }
                    if (!bool.booleanValue()) {
                        return false;
                    }
                }
                return true;
            }
        }

        static {
            C0319a c0319a = new C0319a();
            f31490a = c0319a;
            b bVar = new b();
            f31491b = bVar;
            f31492c = new EnumC0318a[]{c0319a, bVar};
        }

        public EnumC0318a() {
            throw null;
        }

        public static EnumC0318a valueOf(String str) {
            return (EnumC0318a) Enum.valueOf(EnumC0318a.class, str);
        }

        public static EnumC0318a[] values() {
            return (EnumC0318a[]) f31492c.clone();
        }

        public abstract boolean a();
    }

    public static boolean a() {
        return f31489b.get();
    }
}
