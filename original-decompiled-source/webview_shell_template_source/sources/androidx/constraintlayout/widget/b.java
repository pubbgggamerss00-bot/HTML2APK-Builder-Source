package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f797a = false;

    /* renamed from: b, reason: collision with root package name */
    public String f798b;

    /* renamed from: c, reason: collision with root package name */
    public a f799c;

    /* renamed from: d, reason: collision with root package name */
    public int f800d;

    /* renamed from: e, reason: collision with root package name */
    public float f801e;

    /* renamed from: f, reason: collision with root package name */
    public String f802f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f803g;
    public int h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        public static final /* synthetic */ a[] A;
        public static final a s;

        /* renamed from: t, reason: collision with root package name */
        public static final a f804t;

        /* renamed from: u, reason: collision with root package name */
        public static final a f805u;

        /* renamed from: v, reason: collision with root package name */
        public static final a f806v;

        /* renamed from: w, reason: collision with root package name */
        public static final a f807w;

        /* renamed from: x, reason: collision with root package name */
        public static final a f808x;

        /* renamed from: y, reason: collision with root package name */
        public static final a f809y;

        /* renamed from: z, reason: collision with root package name */
        public static final a f810z;

        static {
            a aVar = new a("INT_TYPE", 0);
            s = aVar;
            a aVar2 = new a("FLOAT_TYPE", 1);
            f804t = aVar2;
            a aVar3 = new a("COLOR_TYPE", 2);
            f805u = aVar3;
            a aVar4 = new a("COLOR_DRAWABLE_TYPE", 3);
            f806v = aVar4;
            a aVar5 = new a("STRING_TYPE", 4);
            f807w = aVar5;
            a aVar6 = new a("BOOLEAN_TYPE", 5);
            f808x = aVar6;
            a aVar7 = new a("DIMENSION_TYPE", 6);
            f809y = aVar7;
            a aVar8 = new a("REFERENCE_TYPE", 7);
            f810z = aVar8;
            A = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) A.clone();
        }
    }

    public b(b bVar, Object obj) {
        this.f798b = bVar.f798b;
        this.f799c = bVar.f799c;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e0.d.f12768e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        a aVar = null;
        boolean z6 = false;
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i6);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z6 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                aVar = a.f808x;
            } else if (index == 3) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                aVar = a.f805u;
            } else if (index == 2) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                aVar = a.f806v;
            } else {
                a aVar2 = a.f809y;
                if (index == 7) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    aVar = a.f804t;
                } else if (index == 6) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    aVar = a.s;
                } else if (index == 9) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    aVar = a.f807w;
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    aVar = a.f810z;
                }
                aVar = aVar2;
            }
        }
        if (string != null && objValueOf != null) {
            b bVar = new b();
            bVar.f798b = string;
            bVar.f799c = aVar;
            bVar.f797a = z6;
            bVar.b(objValueOf);
            map.put(string, bVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (this.f799c.ordinal()) {
            case 0:
            case 7:
                this.f800d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f801e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f802f = (String) obj;
                break;
            case 5:
                this.f803g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f801e = ((Float) obj).floatValue();
                break;
        }
    }
}
