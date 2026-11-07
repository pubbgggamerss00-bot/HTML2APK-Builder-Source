package q3;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class e {

    public interface a {
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final c[] f21877a;

        public b(c[] cVarArr) {
            this.f21877a = cVarArr;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f21878a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21879b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f21880c;

        /* renamed from: d, reason: collision with root package name */
        public final String f21881d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21882e;

        /* renamed from: f, reason: collision with root package name */
        public final int f21883f;

        public c(int i10, int i11, int i12, String str, String str2, boolean z10) {
            this.f21878a = str;
            this.f21879b = i10;
            this.f21880c = z10;
            this.f21881d = str2;
            this.f21882e = i11;
            this.f21883f = i12;
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f21884a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21885b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21886c;

        /* renamed from: d, reason: collision with root package name */
        public final String f21887d;

        public d(ArrayList arrayList, int i10, int i11, String str) {
            this.f21884a = arrayList;
            this.f21886c = i10;
            this.f21885b = i11;
            this.f21887d = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i10;
        int i11;
        String str;
        String str2;
        ?? r32;
        long j10;
        Throwable th2;
        TypedArray typedArray;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        do {
            next = xmlResourceParser.next();
            i10 = 2;
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
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), n3.a.f18332b);
        int i12 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i13 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), n3.a.f18333c);
                        int i14 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z10 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i15 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i16 = typedArrayObtainAttributes2.getInt(i15, 0);
                        int i17 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i17, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i17);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            c(xmlResourceParser);
                        }
                        arrayList.add(new c(i14, i16, resourceId2, string7, string6, z10));
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
        List<List<byte[]>> listB = b(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i13) {
            if (xmlResourceParser.getEventType() == i10) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), n3.a.f18334d);
                    int i18 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i12);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i10);
                        if (string8 == null) {
                            r32 = typedArrayObtainAttributes3;
                            j10 = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                c(xmlResourceParser);
                            } catch (Throwable th3) {
                                th2 = th3;
                                typedArray = typedArrayObtainAttributes3;
                                j10 = 1;
                            }
                        }
                        try {
                            r32 = typedArrayObtainAttributes3;
                            str2 = string4;
                            i11 = i18;
                            str = string3;
                            j10 = 1;
                            try {
                                v3.e eVar = new v3.e(string, string2, string8, listB, string9, string10);
                                if (r32 instanceof AutoCloseable) {
                                    ((AutoCloseable) r32).close();
                                } else if (r32 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r32;
                                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z11 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z11) {
                                                    executorService.shutdownNow();
                                                    z11 = true;
                                                }
                                            }
                                        }
                                        if (z11) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r32.recycle();
                                }
                                arrayList2.add(eVar);
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r32 = typedArrayObtainAttributes3;
                            j10 = 1;
                            th2 = th;
                            typedArray = r32;
                            if (typedArray != null) {
                            }
                        }
                        th = th4;
                    } catch (Throwable th6) {
                        th = th6;
                        r32 = typedArrayObtainAttributes3;
                    }
                    th2 = th;
                    typedArray = r32;
                    if (typedArray != null) {
                        throw th2;
                    }
                    try {
                        if (typedArray instanceof AutoCloseable) {
                            typedArray.close();
                            throw th2;
                        }
                        if (!(typedArray instanceof ExecutorService)) {
                            typedArray.recycle();
                            throw th2;
                        }
                        ExecutorService executorService2 = (ExecutorService) typedArray;
                        if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                            throw th2;
                        }
                        executorService2.shutdown();
                        boolean z12 = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService2.awaitTermination(j10, TimeUnit.DAYS);
                            } catch (InterruptedException unused2) {
                                if (!z12) {
                                    executorService2.shutdownNow();
                                    z12 = true;
                                }
                            }
                        }
                        if (!z12) {
                            throw th2;
                        }
                        Thread.currentThread().interrupt();
                        throw th2;
                    } catch (Throwable th7) {
                        th2.addSuppressed(th7);
                        throw th2;
                    }
                }
                i11 = integer;
                str = string3;
                str2 = string4;
                c(xmlResourceParser);
                integer = i11;
                string3 = str;
                string4 = str2;
                i10 = 2;
                i12 = 0;
                i13 = 3;
            }
        }
        int i19 = integer;
        String str3 = string3;
        String str4 = string4;
        if (!arrayList2.isEmpty()) {
            return new d(arrayList2, i19, integer2, string5);
        }
        if (str3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new v3.e(string, string2, str3, listB, null, null));
        if (str4 != null) {
            arrayList2.add(new v3.e(string, string2, str4, listB, null, null));
        }
        return new d(arrayList2, i19, integer2, string5);
    }

    public static List<List<byte[]>> b(Resources resources, int i10) throws Resources.NotFoundException {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
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
                String[] stringArray2 = resources.getStringArray(i10);
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
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}
