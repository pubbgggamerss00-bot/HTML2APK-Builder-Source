package x9;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class e {

    public static abstract class a {
        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33477a;

        /* renamed from: b, reason: collision with root package name */
        public static final b f33478b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f33479c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f33480d;

        static {
            b bVar = new b("NETWORK_UNMETERED", 0);
            f33477a = bVar;
            b bVar2 = new b("DEVICE_IDLE", 1);
            f33478b = bVar2;
            b bVar3 = new b("DEVICE_CHARGING", 2);
            f33479c = bVar3;
            f33480d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f33480d.clone();
        }
    }

    public abstract aa.a a();

    public final long b(o9.c cVar, long j10, int i10) {
        long jA = j10 - a().a();
        a aVar = c().get(cVar);
        long jA2 = aVar.a();
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * jA2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA2 > 1 ? jA2 : 2L) * r12))), jA), aVar.c());
    }

    public abstract Map<o9.c, a> c();
}
