package q9;

import android.util.SparseArray;

/* loaded from: classes.dex */
public abstract class s {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseArray<a> f22588a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f22589b;

        /* JADX INFO: Fake field, exist only in values array */
        a EF1;

        static {
            a aVar = new a("UNKNOWN_MOBILE_SUBTYPE", 0);
            a aVar2 = new a("GPRS", 1);
            a aVar3 = new a("EDGE", 2);
            a aVar4 = new a("UMTS", 3);
            a aVar5 = new a("CDMA", 4);
            a aVar6 = new a("EVDO_0", 5);
            a aVar7 = new a("EVDO_A", 6);
            a aVar8 = new a("RTT", 7);
            a aVar9 = new a("HSDPA", 8);
            a aVar10 = new a("HSUPA", 9);
            a aVar11 = new a("HSPA", 10);
            a aVar12 = new a("IDEN", 11);
            a aVar13 = new a("EVDO_B", 12);
            a aVar14 = new a("LTE", 13);
            a aVar15 = new a("EHRPD", 14);
            a aVar16 = new a("HSPAP", 15);
            a aVar17 = new a("GSM", 16);
            a aVar18 = new a("TD_SCDMA", 17);
            a aVar19 = new a("IWLAN", 18);
            a aVar20 = new a("LTE_CA", 19);
            f22589b = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, new a("COMBINED", 20)};
            SparseArray<a> sparseArray = new SparseArray<>();
            f22588a = sparseArray;
            sparseArray.put(0, aVar);
            sparseArray.put(1, aVar2);
            sparseArray.put(2, aVar3);
            sparseArray.put(3, aVar4);
            sparseArray.put(4, aVar5);
            sparseArray.put(5, aVar6);
            sparseArray.put(6, aVar7);
            sparseArray.put(7, aVar8);
            sparseArray.put(8, aVar9);
            sparseArray.put(9, aVar10);
            sparseArray.put(10, aVar11);
            sparseArray.put(11, aVar12);
            sparseArray.put(12, aVar13);
            sparseArray.put(13, aVar14);
            sparseArray.put(14, aVar15);
            sparseArray.put(15, aVar16);
            sparseArray.put(16, aVar17);
            sparseArray.put(17, aVar18);
            sparseArray.put(18, aVar19);
            sparseArray.put(19, aVar20);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f22589b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseArray<b> f22590a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f22591b;

        /* JADX INFO: Fake field, exist only in values array */
        b EF1;

        static {
            b bVar = new b("MOBILE", 0);
            b bVar2 = new b("WIFI", 1);
            b bVar3 = new b("MOBILE_MMS", 2);
            b bVar4 = new b("MOBILE_SUPL", 3);
            b bVar5 = new b("MOBILE_DUN", 4);
            b bVar6 = new b("MOBILE_HIPRI", 5);
            b bVar7 = new b("WIMAX", 6);
            b bVar8 = new b("BLUETOOTH", 7);
            b bVar9 = new b("DUMMY", 8);
            b bVar10 = new b("ETHERNET", 9);
            b bVar11 = new b("MOBILE_FOTA", 10);
            b bVar12 = new b("MOBILE_IMS", 11);
            b bVar13 = new b("MOBILE_CBS", 12);
            b bVar14 = new b("WIFI_P2P", 13);
            b bVar15 = new b("MOBILE_IA", 14);
            b bVar16 = new b("MOBILE_EMERGENCY", 15);
            b bVar17 = new b("PROXY", 16);
            b bVar18 = new b("VPN", 17);
            b bVar19 = new b("NONE", 18);
            f22591b = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19};
            SparseArray<b> sparseArray = new SparseArray<>();
            f22590a = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar13);
            sparseArray.put(13, bVar14);
            sparseArray.put(14, bVar15);
            sparseArray.put(15, bVar16);
            sparseArray.put(16, bVar17);
            sparseArray.put(17, bVar18);
            sparseArray.put(-1, bVar19);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f22591b.clone();
        }
    }

    public abstract a a();

    public abstract b b();
}
