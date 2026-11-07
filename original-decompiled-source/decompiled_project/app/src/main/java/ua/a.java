package ua;

import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import j2.y;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import nc.n;

/* loaded from: classes2.dex */
public abstract class a {

    public interface b<I, O> {
    }

    public static final Object zaD(C0303a c0303a, Object obj) {
        b bVar = c0303a.f29673l;
        if (bVar != null) {
            ta.a aVar = (ta.a) bVar;
            obj = (String) aVar.f28620c.get(((Integer) obj).intValue());
            if (obj == null && aVar.f28619b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zaE(C0303a c0303a, Object obj) {
        int i10 = c0303a.f29666d;
        b bVar = c0303a.f29673l;
        p.f(bVar);
        HashMap map = ((ta.a) bVar).f28619b;
        Integer num = (Integer) map.get((String) obj);
        Integer num2 = num;
        if (num == null) {
            num2 = (Integer) map.get("gms_unknown");
        }
        p.f(num2);
        String str = c0303a.f29668f;
        switch (i10) {
            case 0:
                setIntegerInternal(c0303a, str, num2.intValue());
                return;
            case 1:
                zaf(c0303a, str, (BigInteger) num2);
                return;
            case 2:
                setLongInternal(c0303a, str, ((Long) num2).longValue());
                return;
            case 3:
            default:
                throw new IllegalStateException(y.a(i10, "Unsupported type for conversion: "));
            case 4:
                zan(c0303a, str, ((Double) num2).doubleValue());
                return;
            case 5:
                zab(c0303a, str, (BigDecimal) num2);
                return;
            case 6:
                setBooleanInternal(c0303a, str, ((Boolean) num2).booleanValue());
                return;
            case 7:
                setStringInternal(c0303a, str, (String) num2);
                return;
            case 8:
            case 9:
                setDecodedBytesInternal(c0303a, str, (byte[]) num2);
                return;
        }
    }

    private static final void zaF(StringBuilder sb, C0303a c0303a, Object obj) {
        int i10 = c0303a.f29664b;
        if (i10 == 11) {
            Class cls = c0303a.f29670h;
            p.f(cls);
            sb.append(((a) cls.cast(obj)).toString());
        } else {
            if (i10 != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(wa.d.a((String) obj));
            sb.append("\"");
        }
    }

    private static final void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    public <T extends a> void addConcreteTypeArrayInternal(C0303a c0303a, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends a> void addConcreteTypeInternal(C0303a c0303a, String str, T t3) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, C0303a<?, ?>> getFieldMappings();

    public Object getFieldValue(C0303a c0303a) {
        String str = c0303a.f29668f;
        if (c0303a.f29670h == null) {
            return getValueObject(str);
        }
        boolean z10 = getValueObject(str) == null;
        String str2 = c0303a.f29668f;
        if (!z10) {
            throw new IllegalStateException(m3.a.a("Concrete field shouldn't be value object: ", str2));
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(C0303a c0303a) {
        if (c0303a.f29666d != 11) {
            return isPrimitiveFieldSet(c0303a.f29668f);
        }
        if (c0303a.f29667e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(C0303a<?, ?> c0303a, String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(C0303a<?, ?> c0303a, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(C0303a<?, ?> c0303a, String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(C0303a<?, ?> c0303a, String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(C0303a<?, ?> c0303a, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(C0303a<?, ?> c0303a, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(C0303a<?, ?> c0303a, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, C0303a<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            C0303a<?, ?> c0303a = fieldMappings.get(str);
            if (isFieldSet(c0303a)) {
                Object objZaD = zaD(c0303a, getFieldValue(c0303a));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objZaD != null) {
                    switch (c0303a.f29666d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objZaD, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objZaD, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            n.b(sb, (HashMap) objZaD);
                            break;
                        default:
                            if (c0303a.f29665c) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        zaF(sb, c0303a, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                zaF(sb, c0303a, objZaD);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final void zaA(C0303a c0303a, String str) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, str);
        } else {
            setStringInternal(c0303a, c0303a.f29668f, str);
        }
    }

    public final void zaB(C0303a c0303a, Map map) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, map);
        } else {
            setStringMapInternal(c0303a, c0303a.f29668f, map);
        }
    }

    public final void zaC(C0303a c0303a, ArrayList arrayList) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, arrayList);
        } else {
            setStringsInternal(c0303a, c0303a.f29668f, arrayList);
        }
    }

    public final void zaa(C0303a c0303a, BigDecimal bigDecimal) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, bigDecimal);
        } else {
            zab(c0303a, c0303a.f29668f, bigDecimal);
        }
    }

    public void zab(C0303a c0303a, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(C0303a c0303a, ArrayList arrayList) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, arrayList);
        } else {
            zad(c0303a, c0303a.f29668f, arrayList);
        }
    }

    public void zad(C0303a c0303a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(C0303a c0303a, BigInteger bigInteger) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, bigInteger);
        } else {
            zaf(c0303a, c0303a.f29668f, bigInteger);
        }
    }

    public void zaf(C0303a c0303a, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(C0303a c0303a, ArrayList arrayList) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, arrayList);
        } else {
            zah(c0303a, c0303a.f29668f, arrayList);
        }
    }

    public void zah(C0303a c0303a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(C0303a c0303a, boolean z10) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, Boolean.valueOf(z10));
        } else {
            setBooleanInternal(c0303a, c0303a.f29668f, z10);
        }
    }

    public final void zaj(C0303a c0303a, ArrayList arrayList) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, arrayList);
        } else {
            zak(c0303a, c0303a.f29668f, arrayList);
        }
    }

    public void zak(C0303a c0303a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(C0303a c0303a, byte[] bArr) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, bArr);
        } else {
            setDecodedBytesInternal(c0303a, c0303a.f29668f, bArr);
        }
    }

    public final void zam(C0303a c0303a, double d10) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, Double.valueOf(d10));
        } else {
            zan(c0303a, c0303a.f29668f, d10);
        }
    }

    public void zan(C0303a c0303a, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(C0303a c0303a, ArrayList arrayList) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, arrayList);
        } else {
            zap(c0303a, c0303a.f29668f, arrayList);
        }
    }

    public void zap(C0303a c0303a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(C0303a c0303a, float f10) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, Float.valueOf(f10));
        } else {
            zar(c0303a, c0303a.f29668f, f10);
        }
    }

    public void zar(C0303a c0303a, String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(C0303a c0303a, ArrayList arrayList) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, arrayList);
        } else {
            zat(c0303a, c0303a.f29668f, arrayList);
        }
    }

    public void zat(C0303a c0303a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(C0303a c0303a, int i10) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, Integer.valueOf(i10));
        } else {
            setIntegerInternal(c0303a, c0303a.f29668f, i10);
        }
    }

    public final void zav(C0303a c0303a, ArrayList arrayList) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, arrayList);
        } else {
            zaw(c0303a, c0303a.f29668f, arrayList);
        }
    }

    public void zaw(C0303a c0303a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(C0303a c0303a, long j10) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, Long.valueOf(j10));
        } else {
            setLongInternal(c0303a, c0303a.f29668f, j10);
        }
    }

    public final void zay(C0303a c0303a, ArrayList arrayList) {
        if (c0303a.f29673l != null) {
            zaE(c0303a, arrayList);
        } else {
            zaz(c0303a, c0303a.f29668f, arrayList);
        }
    }

    public void zaz(C0303a c0303a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    /* renamed from: ua.a$a, reason: collision with other inner class name */
    public static class C0303a<I, O> extends qa.a {
        public static final d CREATOR = new d();

        /* renamed from: a, reason: collision with root package name */
        public final int f29663a;

        /* renamed from: b, reason: collision with root package name */
        public final int f29664b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f29665c;

        /* renamed from: d, reason: collision with root package name */
        public final int f29666d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f29667e;

        /* renamed from: f, reason: collision with root package name */
        public final String f29668f;

        /* renamed from: g, reason: collision with root package name */
        public final int f29669g;

        /* renamed from: h, reason: collision with root package name */
        public final Class f29670h;

        /* renamed from: j, reason: collision with root package name */
        public final String f29671j;

        /* renamed from: k, reason: collision with root package name */
        public h f29672k;

        /* renamed from: l, reason: collision with root package name */
        public final b f29673l;

        public C0303a(int i10, int i11, boolean z10, int i12, boolean z11, String str, int i13, String str2, ta.b bVar) {
            this.f29663a = i10;
            this.f29664b = i11;
            this.f29665c = z10;
            this.f29666d = i12;
            this.f29667e = z11;
            this.f29668f = str;
            this.f29669g = i13;
            if (str2 == null) {
                this.f29670h = null;
                this.f29671j = null;
            } else {
                this.f29670h = c.class;
                this.f29671j = str2;
            }
            if (bVar == null) {
                this.f29673l = null;
                return;
            }
            ta.a aVar = bVar.f28622b;
            if (aVar == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            this.f29673l = aVar;
        }

        public static C0303a d(int i10, String str) {
            return new C0303a(7, true, 7, true, str, i10, null);
        }

        public final String toString() {
            o.a aVar = new o.a(this);
            aVar.a(Integer.valueOf(this.f29663a), "versionCode");
            aVar.a(Integer.valueOf(this.f29664b), "typeIn");
            aVar.a(Boolean.valueOf(this.f29665c), "typeInArray");
            aVar.a(Integer.valueOf(this.f29666d), "typeOut");
            aVar.a(Boolean.valueOf(this.f29667e), "typeOutArray");
            aVar.a(this.f29668f, "outputFieldName");
            aVar.a(Integer.valueOf(this.f29669g), "safeParcelFieldId");
            String str = this.f29671j;
            if (str == null) {
                str = null;
            }
            aVar.a(str, "concreteTypeName");
            Class cls = this.f29670h;
            if (cls != null) {
                aVar.a(cls.getCanonicalName(), "concreteType.class");
            }
            b bVar = this.f29673l;
            if (bVar != null) {
                aVar.a(bVar.getClass().getCanonicalName(), "converterName");
            }
            return aVar.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int iQ = c1.q(20293, parcel);
            c1.s(parcel, 1, 4);
            parcel.writeInt(this.f29663a);
            c1.s(parcel, 2, 4);
            parcel.writeInt(this.f29664b);
            c1.s(parcel, 3, 4);
            parcel.writeInt(this.f29665c ? 1 : 0);
            c1.s(parcel, 4, 4);
            parcel.writeInt(this.f29666d);
            c1.s(parcel, 5, 4);
            parcel.writeInt(this.f29667e ? 1 : 0);
            c1.m(parcel, 6, this.f29668f, false);
            c1.s(parcel, 7, 4);
            parcel.writeInt(this.f29669g);
            ta.b bVar = null;
            String str = this.f29671j;
            if (str == null) {
                str = null;
            }
            c1.m(parcel, 8, str, false);
            b bVar2 = this.f29673l;
            if (bVar2 != null) {
                if (!(bVar2 instanceof ta.a)) {
                    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
                }
                bVar = new ta.b((ta.a) bVar2);
            }
            c1.l(parcel, 9, bVar, i10, false);
            c1.r(iQ, parcel);
        }

        public C0303a(int i10, boolean z10, int i11, boolean z11, String str, int i12, Class cls) {
            this.f29663a = 1;
            this.f29664b = i10;
            this.f29665c = z10;
            this.f29666d = i11;
            this.f29667e = z11;
            this.f29668f = str;
            this.f29669g = i12;
            this.f29670h = cls;
            if (cls == null) {
                this.f29671j = null;
            } else {
                this.f29671j = cls.getCanonicalName();
            }
            this.f29673l = null;
        }
    }
}
