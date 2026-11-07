package l0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final c[] f13783a;

        public b(c[] cVarArr) {
            this.f13783a = cVarArr;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f13784a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13785b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f13786c;

        /* renamed from: d, reason: collision with root package name */
        public final String f13787d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13788e;

        /* renamed from: f, reason: collision with root package name */
        public final int f13789f;

        public c(int i6, int i7, int i8, String str, String str2, boolean z6) {
            this.f13784a = str;
            this.f13785b = i6;
            this.f13786c = z6;
            this.f13787d = str2;
            this.f13788e = i7;
            this.f13789f = i8;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final r0.e f13790a;

        /* renamed from: b, reason: collision with root package name */
        public final r0.e f13791b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13792c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13793d;

        /* renamed from: e, reason: collision with root package name */
        public final String f13794e;

        public d(r0.e eVar, r0.e eVar2, int i6, int i7, String str) {
            this.f13790a = eVar;
            this.f13791b = eVar2;
            this.f13793d = i6;
            this.f13792c = i7;
            this.f13794e = str;
        }
    }

    public static a a(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            c(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), h0.a.f13269b);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                c(xmlResourceParser);
            }
            List<List<byte[]>> listB = b(resources, resourceId);
            return new d(new r0.e(string, string2, string3, listB), string4 != null ? new r0.e(string, string2, string4, listB) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), h0.a.f13270c);
                    int i6 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z6 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i7 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i8 = typedArrayObtainAttributes2.getInt(i7, 0);
                    int i9 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i9, 0);
                    String string7 = typedArrayObtainAttributes2.getString(i9);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        c(xmlResourceParser);
                    }
                    arrayList.add(new c(i6, i8, resourceId2, string7, string6, z6));
                } else {
                    c(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[0]));
    }

    public static List<List<byte[]>> b(Resources resources, int i6) throws Resources.NotFoundException {
        if (i6 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i6);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i7 = 0; i7 < typedArrayObtainTypedArray.length(); i7++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i7, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i6);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i6 = 1;
        while (i6 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i6++;
            } else if (next == 3) {
                i6--;
            }
        }
    }
}
