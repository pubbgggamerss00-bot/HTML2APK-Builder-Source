package com.basitce.htmltoapk.data.licenses;

import android.content.Context;
import android.content.res.Resources;
import androidx.room.y0;
import androidx.room.z0;
import b.o;
import c0.g0;
import com.basitce.htmltoapk.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.p;
import kotlinx.serialization.json.q;
import l0.k;
import mh.x;
import pg.n;
import qg.a0;
import qg.z;
import r.o2;
import zh.g;

/* loaded from: classes.dex */
public final class OpenSourceLicenses {

    /* renamed from: a, reason: collision with root package name */
    public static final p f5676a = q.a(new m8.a(0));

    @g
    public static final class LibraryJson {
        public static final a Companion = new a();

        /* renamed from: i, reason: collision with root package name */
        public static final zh.b<Object>[] f5680i = {null, null, null, null, null, new ArrayListSerializer(OpenSourceLicenses$Named$$serializer.INSTANCE), null, new ArrayListSerializer(StringSerializer.INSTANCE)};

        /* renamed from: a, reason: collision with root package name */
        public final String f5681a;

        /* renamed from: b, reason: collision with root package name */
        public final String f5682b;

        /* renamed from: c, reason: collision with root package name */
        public final String f5683c;

        /* renamed from: d, reason: collision with root package name */
        public final String f5684d;

        /* renamed from: e, reason: collision with root package name */
        public final String f5685e;

        /* renamed from: f, reason: collision with root package name */
        public final List<Named> f5686f;

        /* renamed from: g, reason: collision with root package name */
        public final Named f5687g;

        /* renamed from: h, reason: collision with root package name */
        public final List<String> f5688h;

        public static final class a {
            public final zh.b<LibraryJson> serializer() {
                return OpenSourceLicenses$LibraryJson$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ LibraryJson(int i10, String str, String str2, String str3, String str4, String str5, List list, Named named, List list2) {
            if (1 != (i10 & 1)) {
                ah.p.e(i10, 1, OpenSourceLicenses$LibraryJson$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.f5681a = str;
            if ((i10 & 2) == 0) {
                this.f5682b = null;
            } else {
                this.f5682b = str2;
            }
            if ((i10 & 4) == 0) {
                this.f5683c = null;
            } else {
                this.f5683c = str3;
            }
            if ((i10 & 8) == 0) {
                this.f5684d = null;
            } else {
                this.f5684d = str4;
            }
            if ((i10 & 16) == 0) {
                this.f5685e = null;
            } else {
                this.f5685e = str5;
            }
            int i11 = i10 & 32;
            z zVar = z.f22752a;
            if (i11 == 0) {
                this.f5686f = zVar;
            } else {
                this.f5686f = list;
            }
            if ((i10 & 64) == 0) {
                this.f5687g = null;
            } else {
                this.f5687g = named;
            }
            if ((i10 & 128) == 0) {
                this.f5688h = zVar;
            } else {
                this.f5688h = list2;
            }
        }
    }

    @g
    public static final class LicenseJson {
        public static final a Companion = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f5689a;

        /* renamed from: b, reason: collision with root package name */
        public final String f5690b;

        /* renamed from: c, reason: collision with root package name */
        public final String f5691c;

        public static final class a {
            public final zh.b<LicenseJson> serializer() {
                return OpenSourceLicenses$LicenseJson$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ LicenseJson(int i10, String str, String str2, String str3) {
            if (1 != (i10 & 1)) {
                ah.p.e(i10, 1, OpenSourceLicenses$LicenseJson$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.f5689a = str;
            if ((i10 & 2) == 0) {
                this.f5690b = null;
            } else {
                this.f5690b = str2;
            }
            if ((i10 & 4) == 0) {
                this.f5691c = null;
            } else {
                this.f5691c = str3;
            }
        }
    }

    @g
    public static final class Named {
        public static final a Companion = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f5692a;

        public static final class a {
            public final zh.b<Named> serializer() {
                return OpenSourceLicenses$Named$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Named(int i10, String str) {
            if ((i10 & 1) == 0) {
                this.f5692a = null;
            } else {
                this.f5692a = str;
            }
        }

        public Named() {
            this.f5692a = null;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f5693a;

        /* renamed from: b, reason: collision with root package name */
        public final String f5694b;

        /* renamed from: c, reason: collision with root package name */
        public final List<String> f5695c;

        /* renamed from: d, reason: collision with root package name */
        public final String f5696d;

        /* renamed from: e, reason: collision with root package name */
        public final String f5697e;

        /* renamed from: f, reason: collision with root package name */
        public final String f5698f;

        /* renamed from: g, reason: collision with root package name */
        public final List<b> f5699g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f5700h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f5701i;

        public a(String id2, String str, List<String> list, String str2, String str3, String str4, List<b> list2, boolean z10, boolean z11) {
            r.e(id2, "id");
            this.f5693a = id2;
            this.f5694b = str;
            this.f5695c = list;
            this.f5696d = str2;
            this.f5697e = str3;
            this.f5698f = str4;
            this.f5699g = list2;
            this.f5700h = z10;
            this.f5701i = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return r.a(this.f5693a, aVar.f5693a) && r.a(this.f5694b, aVar.f5694b) && r.a(this.f5695c, aVar.f5695c) && r.a(this.f5696d, aVar.f5696d) && r.a(this.f5697e, aVar.f5697e) && r.a(this.f5698f, aVar.f5698f) && r.a(this.f5699g, aVar.f5699g) && this.f5700h == aVar.f5700h && this.f5701i == aVar.f5701i;
        }

        public final int hashCode() {
            int iA = a2.a.a(this.f5695c, k.a(this.f5693a.hashCode() * 31, 31, this.f5694b), 31);
            String str = this.f5696d;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f5697e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f5698f;
            return Boolean.hashCode(this.f5701i) + o2.a(a2.a.a(this.f5699g, (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31, this.f5700h);
        }

        public final String toString() {
            StringBuilder sbA = y0.a("Library(id=", this.f5693a, ", name=", this.f5694b, ", versions=");
            sbA.append(this.f5695c);
            sbA.append(", description=");
            sbA.append(this.f5696d);
            sbA.append(", website=");
            z0.a(sbA, this.f5697e, ", authors=", this.f5698f, ", licenses=");
            sbA.append(this.f5699g);
            sbA.append(", inApp=");
            sbA.append(this.f5700h);
            sbA.append(", inShell=");
            sbA.append(this.f5701i);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f5702a;

        /* renamed from: b, reason: collision with root package name */
        public final String f5703b;

        /* renamed from: c, reason: collision with root package name */
        public final String f5704c;

        public b(String name, String str, String str2) {
            r.e(name, "name");
            this.f5702a = name;
            this.f5703b = str;
            this.f5704c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return r.a(this.f5702a, bVar.f5702a) && r.a(this.f5703b, bVar.f5703b) && r.a(this.f5704c, bVar.f5704c);
        }

        public final int hashCode() {
            int iHashCode = this.f5702a.hashCode() * 31;
            String str = this.f5703b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f5704c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return o.a(y0.a("License(name=", this.f5702a, ", url=", this.f5703b, ", text="), this.f5704c, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(Context context) throws Resources.NotFoundException, IOException {
        Iterator it;
        b bVar;
        String strB = b(context, R.raw.aboutlibraries);
        String strB2 = b(context, R.raw.template_libraries);
        p pVar = f5676a;
        pVar.getClass();
        Definitions.a aVar = Definitions.Companion;
        Definitions definitions = (Definitions) pVar.b(aVar.serializer(), strB);
        Definitions definitions2 = (Definitions) pVar.b(aVar.serializer(), strB2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = qg.p.j(new n(definitions, Boolean.TRUE), new n(definitions2, Boolean.FALSE)).iterator();
        while (it2.hasNext()) {
            n nVar = (n) it2.next();
            Definitions definitions3 = (Definitions) nVar.f21469a;
            boolean zBooleanValue = ((Boolean) nVar.f21470b).booleanValue();
            for (LibraryJson libraryJson : definitions3.f5678a) {
                Map<String, LicenseJson> map = definitions3.f5679b;
                String str = libraryJson.f5681a;
                String strR = libraryJson.f5682b;
                if (strR == null) {
                    strR = x.R(str, ':', str);
                } else {
                    if (x.A(strR) || strR.equals("${project.artifactId}")) {
                        strR = null;
                    }
                    if (strR == null) {
                    }
                }
                String str2 = libraryJson.f5683c;
                if (str2 == null || x.A(str2)) {
                    str2 = null;
                }
                List listC = z.f22752a;
                List listC2 = str2 != null ? g0.c(str2) : listC;
                String str3 = libraryJson.f5684d;
                if (str3 == null || x.A(str3)) {
                    str3 = null;
                }
                String str4 = libraryJson.f5685e;
                if (str4 == null || x.A(str4)) {
                    str4 = null;
                }
                List<Named> list = libraryJson.f5686f;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    String str5 = ((Named) it3.next()).f5692a;
                    if (str5 != null) {
                        arrayList.add(str5);
                    }
                }
                Named named = libraryJson.f5687g;
                String str6 = named != null ? named.f5692a : null;
                if (str6 != null) {
                    listC = g0.c(str6);
                }
                ArrayList arrayListO = qg.x.O(listC, arrayList);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayListO.size();
                int i10 = 0;
                while (i10 < size) {
                    Iterator it4 = it2;
                    Object obj = arrayListO.get(i10);
                    i10++;
                    if (!x.A((String) obj)) {
                        arrayList2.add(obj);
                    }
                    it2 = it4;
                }
                Iterator it5 = it2;
                String strI = qg.x.I(qg.x.x(arrayList2), null, null, null, null, 63);
                String str7 = x.A(strI) ? null : strI;
                List<String> list2 = libraryJson.f5688h;
                String str8 = str3;
                ArrayList arrayList3 = new ArrayList(qg.p.h(list2, 10));
                Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    String str9 = (String) it6.next();
                    LicenseJson licenseJson = map.get(str9);
                    if (licenseJson != null) {
                        String str10 = licenseJson.f5689a;
                        String str11 = licenseJson.f5690b;
                        String str12 = licenseJson.f5691c;
                        if (str12 == null || x.A(str12)) {
                            it = it6;
                            str12 = null;
                        } else {
                            it = it6;
                        }
                        bVar = new b(str10, str11, str12);
                    } else {
                        it = it6;
                        bVar = new b(str9, null, null);
                    }
                    arrayList3.add(bVar);
                    it6 = it;
                }
                String str13 = strR;
                List list3 = listC2;
                a aVar2 = new a(str, str13, list3, str8, str4, str7, arrayList3, zBooleanValue, !zBooleanValue);
                a aVar3 = (a) linkedHashMap.get(str);
                if (aVar3 != null) {
                    List listX = qg.x.x(qg.x.O(list3, aVar3.f5695c));
                    boolean z10 = aVar3.f5700h || zBooleanValue;
                    boolean z11 = aVar3.f5701i || !zBooleanValue;
                    String id2 = aVar3.f5693a;
                    String str14 = aVar3.f5694b;
                    String str15 = aVar3.f5696d;
                    String str16 = aVar3.f5697e;
                    String str17 = aVar3.f5698f;
                    List<b> list4 = aVar3.f5699g;
                    r.e(id2, "id");
                    aVar2 = new a(id2, str14, listX, str15, str16, str17, list4, z10, z11);
                }
                linkedHashMap.put(str, aVar2);
                it2 = it5;
            }
        }
        Collection collectionValues = linkedHashMap.values();
        r.d(collectionValues, "<get-values>(...)");
        return qg.x.U(new m8.b(), collectionValues);
    }

    public static String b(Context context, int i10) throws Resources.NotFoundException, IOException {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i10);
        r.d(inputStreamOpenRawResource, "openRawResource(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, mh.a.f18238b), 8192);
        try {
            String strD = ah.p.d(bufferedReader);
            bufferedReader.close();
            return strD;
        } finally {
        }
    }

    @g
    public static final class Definitions {
        public static final a Companion = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final zh.b<Object>[] f5677c = {new ArrayListSerializer(OpenSourceLicenses$LibraryJson$$serializer.INSTANCE), new LinkedHashMapSerializer(StringSerializer.INSTANCE, OpenSourceLicenses$LicenseJson$$serializer.INSTANCE)};

        /* renamed from: a, reason: collision with root package name */
        public final List<LibraryJson> f5678a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, LicenseJson> f5679b;

        public static final class a {
            public final zh.b<Definitions> serializer() {
                return OpenSourceLicenses$Definitions$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Definitions(int i10, List list, Map map) {
            this.f5678a = (i10 & 1) == 0 ? z.f22752a : list;
            if ((i10 & 2) == 0) {
                this.f5679b = a0.f22708a;
            } else {
                this.f5679b = map;
            }
        }

        public Definitions() {
            this.f5678a = z.f22752a;
            this.f5679b = a0.f22708a;
        }
    }
}
