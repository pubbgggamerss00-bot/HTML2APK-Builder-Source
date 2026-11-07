package ua;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.p;
import j2.y;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import nc.n;
import qa.b;
import ua.a;

/* loaded from: classes2.dex */
public final class c extends b {
    public static final Parcelable.Creator<c> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final int f29674a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f29675b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29676c;

    /* renamed from: d, reason: collision with root package name */
    public final h f29677d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29678e;

    /* renamed from: f, reason: collision with root package name */
    public int f29679f;

    /* renamed from: g, reason: collision with root package name */
    public int f29680g;

    public c(int i10, Parcel parcel, h hVar) {
        this.f29674a = i10;
        p.f(parcel);
        this.f29675b = parcel;
        this.f29676c = 2;
        this.f29677d = hVar;
        this.f29678e = hVar == null ? null : hVar.f29689c;
        this.f29679f = 2;
    }

    public static void c(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel parcelObtain;
        BigInteger[] bigIntegerArr;
        long[] jArrCreateLongArray;
        float[] fArrCreateFloatArray;
        double[] dArrCreateDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] zArrCreateBooleanArray;
        String[] strArrCreateStringArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((a.C0303a) entry.getValue()).f29669g, entry);
        }
        sb.append('{');
        int iT = qa.b.t(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i10);
            if (entry2 != null) {
                if (z10) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                a.C0303a c0303a = (a.C0303a) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                a.b bVar = c0303a.f29673l;
                String str2 = c0303a.f29671j;
                int i11 = c0303a.f29666d;
                if (bVar != null) {
                    switch (i11) {
                        case 0:
                            e(sb, c0303a, a.zaD(c0303a, Integer.valueOf(qa.b.n(i10, parcel))));
                            break;
                        case 1:
                            int iR = qa.b.r(i10, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iR == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iR);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            e(sb, c0303a, a.zaD(c0303a, bigInteger2));
                            break;
                        case 2:
                            e(sb, c0303a, a.zaD(c0303a, Long.valueOf(qa.b.p(i10, parcel))));
                            break;
                        case 3:
                            qa.b.v(parcel, i10, 4);
                            e(sb, c0303a, a.zaD(c0303a, Float.valueOf(parcel.readFloat())));
                            break;
                        case 4:
                            qa.b.v(parcel, i10, 8);
                            e(sb, c0303a, a.zaD(c0303a, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            e(sb, c0303a, a.zaD(c0303a, qa.b.a(i10, parcel)));
                            break;
                        case 6:
                            e(sb, c0303a, a.zaD(c0303a, Boolean.valueOf(qa.b.k(i10, parcel))));
                            break;
                        case 7:
                            e(sb, c0303a, a.zaD(c0303a, qa.b.f(i10, parcel)));
                            break;
                        case 8:
                        case 9:
                            e(sb, c0303a, a.zaD(c0303a, qa.b.c(i10, parcel)));
                            break;
                        case 10:
                            Bundle bundleB = qa.b.b(i10, parcel);
                            HashMap map2 = new HashMap();
                            for (String str3 : bundleB.keySet()) {
                                String string = bundleB.getString(str3);
                                p.f(string);
                                map2.put(str3, string);
                            }
                            e(sb, c0303a, a.zaD(c0303a, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(y.a(i11, "Unknown field out type = "));
                    }
                } else if (c0303a.f29667e) {
                    sb.append("[");
                    switch (i11) {
                        case 0:
                            int[] iArrD = qa.b.d(i10, parcel);
                            int length = iArrD.length;
                            for (int i12 = 0; i12 < length; i12++) {
                                if (i12 != 0) {
                                    sb.append(",");
                                }
                                sb.append(iArrD[i12]);
                            }
                            break;
                        case 1:
                            int iR2 = qa.b.r(i10, parcel);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iR2 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int i13 = parcel.readInt();
                                bigIntegerArr = new BigInteger[i13];
                                for (int i14 = 0; i14 < i13; i14++) {
                                    bigIntegerArr[i14] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(iDataPosition2 + iR2);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i15 = 0; i15 < length2; i15++) {
                                if (i15 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigIntegerArr[i15]);
                            }
                            break;
                        case 2:
                            int iR3 = qa.b.r(i10, parcel);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iR3 == 0) {
                                jArrCreateLongArray = null;
                            } else {
                                jArrCreateLongArray = parcel.createLongArray();
                                parcel.setDataPosition(iDataPosition3 + iR3);
                            }
                            int length3 = jArrCreateLongArray.length;
                            for (int i16 = 0; i16 < length3; i16++) {
                                if (i16 != 0) {
                                    sb.append(",");
                                }
                                sb.append(jArrCreateLongArray[i16]);
                            }
                            break;
                        case 3:
                            int iR4 = qa.b.r(i10, parcel);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iR4 == 0) {
                                fArrCreateFloatArray = null;
                            } else {
                                fArrCreateFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(iDataPosition4 + iR4);
                            }
                            int length4 = fArrCreateFloatArray.length;
                            for (int i17 = 0; i17 < length4; i17++) {
                                if (i17 != 0) {
                                    sb.append(",");
                                }
                                sb.append(fArrCreateFloatArray[i17]);
                            }
                            break;
                        case 4:
                            int iR5 = qa.b.r(i10, parcel);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iR5 == 0) {
                                dArrCreateDoubleArray = null;
                            } else {
                                dArrCreateDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(iDataPosition5 + iR5);
                            }
                            int length5 = dArrCreateDoubleArray.length;
                            for (int i18 = 0; i18 < length5; i18++) {
                                if (i18 != 0) {
                                    sb.append(",");
                                }
                                sb.append(dArrCreateDoubleArray[i18]);
                            }
                            break;
                        case 5:
                            int iR6 = qa.b.r(i10, parcel);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iR6 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int i19 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[i19];
                                for (int i20 = 0; i20 < i19; i20++) {
                                    bigDecimalArr[i20] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(iDataPosition6 + iR6);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i21 = 0; i21 < length6; i21++) {
                                if (i21 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigDecimalArr[i21]);
                            }
                            break;
                        case 6:
                            int iR7 = qa.b.r(i10, parcel);
                            int iDataPosition7 = parcel.dataPosition();
                            if (iR7 == 0) {
                                zArrCreateBooleanArray = null;
                            } else {
                                zArrCreateBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(iDataPosition7 + iR7);
                            }
                            int length7 = zArrCreateBooleanArray.length;
                            for (int i22 = 0; i22 < length7; i22++) {
                                if (i22 != 0) {
                                    sb.append(",");
                                }
                                sb.append(zArrCreateBooleanArray[i22]);
                            }
                            break;
                        case 7:
                            int iR8 = qa.b.r(i10, parcel);
                            int iDataPosition8 = parcel.dataPosition();
                            if (iR8 == 0) {
                                strArrCreateStringArray = null;
                            } else {
                                strArrCreateStringArray = parcel.createStringArray();
                                parcel.setDataPosition(iDataPosition8 + iR8);
                            }
                            int length8 = strArrCreateStringArray.length;
                            for (int i23 = 0; i23 < length8; i23++) {
                                if (i23 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(strArrCreateStringArray[i23]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int iR9 = qa.b.r(i10, parcel);
                            int iDataPosition9 = parcel.dataPosition();
                            if (iR9 == 0) {
                                parcelArr = null;
                            } else {
                                int i24 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[i24];
                                for (int i25 = 0; i25 < i24; i25++) {
                                    int i26 = parcel.readInt();
                                    if (i26 != 0) {
                                        int iDataPosition10 = parcel.dataPosition();
                                        Parcel parcelObtain2 = Parcel.obtain();
                                        parcelObtain2.appendFrom(parcel, iDataPosition10, i26);
                                        parcelArr2[i25] = parcelObtain2;
                                        parcel.setDataPosition(iDataPosition10 + i26);
                                    } else {
                                        parcelArr2[i25] = null;
                                    }
                                }
                                parcel.setDataPosition(iDataPosition9 + iR9);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i27 = 0; i27 < length9; i27++) {
                                if (i27 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i27].setDataPosition(0);
                                p.f(str2);
                                p.f(c0303a.f29672k);
                                Map map3 = (Map) c0303a.f29672k.f29688b.get(str2);
                                p.f(map3);
                                c(sb, map3, parcelArr[i27]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (i11) {
                        case 0:
                            sb.append(qa.b.n(i10, parcel));
                            break;
                        case 1:
                            int iR10 = qa.b.r(i10, parcel);
                            int iDataPosition11 = parcel.dataPosition();
                            if (iR10 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition11 + iR10);
                                bigInteger = new BigInteger(bArrCreateByteArray2);
                            }
                            sb.append(bigInteger);
                            break;
                        case 2:
                            sb.append(qa.b.p(i10, parcel));
                            break;
                        case 3:
                            qa.b.v(parcel, i10, 4);
                            sb.append(parcel.readFloat());
                            break;
                        case 4:
                            qa.b.v(parcel, i10, 8);
                            sb.append(parcel.readDouble());
                            break;
                        case 5:
                            sb.append(qa.b.a(i10, parcel));
                            break;
                        case 6:
                            sb.append(qa.b.k(i10, parcel));
                            break;
                        case 7:
                            String strF = qa.b.f(i10, parcel);
                            sb.append("\"");
                            sb.append(wa.d.a(strF));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrC = qa.b.c(i10, parcel);
                            sb.append("\"");
                            sb.append(bArrC == null ? null : Base64.encodeToString(bArrC, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] bArrC2 = qa.b.c(i10, parcel);
                            sb.append("\"");
                            sb.append(bArrC2 == null ? null : Base64.encodeToString(bArrC2, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle bundleB2 = qa.b.b(i10, parcel);
                            Set<String> setKeySet = bundleB2.keySet();
                            sb.append("{");
                            boolean z11 = true;
                            for (String str4 : setKeySet) {
                                if (!z11) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str4);
                                sb.append("\":\"");
                                sb.append(wa.d.a(bundleB2.getString(str4)));
                                sb.append("\"");
                                z11 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            int iR11 = qa.b.r(i10, parcel);
                            int iDataPosition12 = parcel.dataPosition();
                            if (iR11 == 0) {
                                parcelObtain = null;
                            } else {
                                parcelObtain = Parcel.obtain();
                                parcelObtain.appendFrom(parcel, iDataPosition12, iR11);
                                parcel.setDataPosition(iDataPosition12 + iR11);
                            }
                            parcelObtain.setDataPosition(0);
                            p.f(str2);
                            p.f(c0303a.f29672k);
                            Map map4 = (Map) c0303a.f29672k.f29688b.get(str2);
                            p.f(map4);
                            c(sb, map4, parcelObtain);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() != iT) {
            throw new b.a(y.a(iT, "Overread allowed size end="), parcel);
        }
        sb.append('}');
    }

    public static final void d(StringBuilder sb, int i10, Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                p.f(obj);
                sb.append(wa.d.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                sb.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb.append("\"");
                return;
            case 10:
                p.f(obj);
                n.b(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(y.a(i10, "Unknown type = "));
        }
    }

    public static final void e(StringBuilder sb, a.C0303a c0303a, Object obj) {
        boolean z10 = c0303a.f29665c;
        int i10 = c0303a.f29664b;
        if (!z10) {
            d(sb, i10, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 != 0) {
                sb.append(",");
            }
            d(sb, i10, arrayList.get(i11));
        }
        sb.append("]");
    }

    public final Parcel a() {
        int i10 = this.f29679f;
        Parcel parcel = this.f29675b;
        if (i10 != 0) {
            if (i10 != 1) {
                return parcel;
            }
            c1.r(this.f29680g, parcel);
            this.f29679f = 2;
            return parcel;
        }
        int iQ = c1.q(20293, parcel);
        this.f29680g = iQ;
        c1.r(iQ, parcel);
        this.f29679f = 2;
        return parcel;
    }

    @Override // ua.a
    public final <T extends a> void addConcreteTypeArrayInternal(a.C0303a c0303a, String str, ArrayList<T> arrayList) {
        b(c0303a);
        ArrayList arrayList2 = new ArrayList();
        p.f(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((c) arrayList.get(i10)).a());
        }
        int i11 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        int iQ = c1.q(i11, parcel);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i12 = 0; i12 < size2; i12++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i12);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        c1.r(iQ, parcel);
    }

    @Override // ua.a
    public final <T extends a> void addConcreteTypeInternal(a.C0303a c0303a, String str, T t3) {
        b(c0303a);
        Parcel parcelA = ((c) t3).a();
        int i10 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        if (parcelA == null) {
            c1.s(parcel, i10, 0);
            return;
        }
        int iQ = c1.q(i10, parcel);
        parcel.appendFrom(parcelA, 0, parcelA.dataSize());
        c1.r(iQ, parcel);
    }

    public final void b(a.C0303a c0303a) {
        if (c0303a.f29669g == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f29675b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i10 = this.f29679f;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f29680g = c1.q(20293, parcel);
            this.f29679f = 1;
        }
    }

    @Override // ua.a
    public final Map<String, a.C0303a<?, ?>> getFieldMappings() {
        h hVar = this.f29677d;
        if (hVar == null) {
            return null;
        }
        String str = this.f29678e;
        p.f(str);
        return (Map) hVar.f29688b.get(str);
    }

    @Override // ua.b, ua.a
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // ua.b, ua.a
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // ua.a
    public final void setBooleanInternal(a.C0303a<?, ?> c0303a, String str, boolean z10) {
        b(c0303a);
        int i10 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        c1.s(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    @Override // ua.a
    public final void setDecodedBytesInternal(a.C0303a<?, ?> c0303a, String str, byte[] bArr) {
        b(c0303a);
        c1.f(this.f29675b, c0303a.f29669g, bArr, true);
    }

    @Override // ua.a
    public final void setIntegerInternal(a.C0303a<?, ?> c0303a, String str, int i10) {
        b(c0303a);
        int i11 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        c1.s(parcel, i11, 4);
        parcel.writeInt(i10);
    }

    @Override // ua.a
    public final void setLongInternal(a.C0303a<?, ?> c0303a, String str, long j10) {
        b(c0303a);
        int i10 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        c1.s(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    @Override // ua.a
    public final void setStringInternal(a.C0303a<?, ?> c0303a, String str, String str2) {
        b(c0303a);
        c1.m(this.f29675b, c0303a.f29669g, str2, true);
    }

    @Override // ua.a
    public final void setStringMapInternal(a.C0303a<?, ?> c0303a, String str, Map<String, String> map) {
        b(c0303a);
        Bundle bundle = new Bundle();
        p.f(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        c1.e(this.f29675b, c0303a.f29669g, bundle, true);
    }

    @Override // ua.a
    public final void setStringsInternal(a.C0303a<?, ?> c0303a, String str, ArrayList<String> arrayList) {
        b(c0303a);
        p.f(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = arrayList.get(i10);
        }
        int i11 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        int iQ = c1.q(i11, parcel);
        parcel.writeStringArray(strArr);
        c1.r(iQ, parcel);
    }

    @Override // ua.a
    public final String toString() {
        h hVar = this.f29677d;
        p.g(hVar, "Cannot convert to JSON on client side.");
        Parcel parcelA = a();
        parcelA.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.f29678e;
        p.f(str);
        Map map = (Map) hVar.f29688b.get(str);
        p.f(map);
        c(sb, map, parcelA);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f29674a);
        Parcel parcelA = a();
        if (parcelA != null) {
            int iQ2 = c1.q(2, parcel);
            parcel.appendFrom(parcelA, 0, parcelA.dataSize());
            c1.r(iQ2, parcel);
        }
        c1.l(parcel, 3, this.f29676c != 0 ? this.f29677d : null, i10, false);
        c1.r(iQ, parcel);
    }

    @Override // ua.a
    public final void zab(a.C0303a c0303a, String str, BigDecimal bigDecimal) {
        b(c0303a);
        int i10 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        if (bigDecimal == null) {
            c1.s(parcel, i10, 0);
            return;
        }
        int iQ = c1.q(i10, parcel);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        c1.r(iQ, parcel);
    }

    @Override // ua.a
    public final void zad(a.C0303a c0303a, String str, ArrayList arrayList) {
        b(c0303a);
        p.f(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        int i11 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        int iQ = c1.q(i11, parcel);
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeByteArray(bigDecimalArr[i12].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i12].scale());
        }
        c1.r(iQ, parcel);
    }

    @Override // ua.a
    public final void zaf(a.C0303a c0303a, String str, BigInteger bigInteger) {
        b(c0303a);
        int i10 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        if (bigInteger == null) {
            c1.s(parcel, i10, 0);
            return;
        }
        int iQ = c1.q(i10, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        c1.r(iQ, parcel);
    }

    @Override // ua.a
    public final void zah(a.C0303a c0303a, String str, ArrayList arrayList) {
        b(c0303a);
        p.f(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        int i11 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        int iQ = c1.q(i11, parcel);
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeByteArray(bigIntegerArr[i12].toByteArray());
        }
        c1.r(iQ, parcel);
    }

    @Override // ua.a
    public final void zak(a.C0303a c0303a, String str, ArrayList arrayList) {
        b(c0303a);
        p.f(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        int i11 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        int iQ = c1.q(i11, parcel);
        parcel.writeBooleanArray(zArr);
        c1.r(iQ, parcel);
    }

    @Override // ua.a
    public final void zan(a.C0303a c0303a, String str, double d10) {
        b(c0303a);
        int i10 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        c1.s(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    @Override // ua.a
    public final void zap(a.C0303a c0303a, String str, ArrayList arrayList) {
        b(c0303a);
        p.f(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        int i11 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        int iQ = c1.q(i11, parcel);
        parcel.writeDoubleArray(dArr);
        c1.r(iQ, parcel);
    }

    @Override // ua.a
    public final void zar(a.C0303a c0303a, String str, float f10) {
        b(c0303a);
        int i10 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        c1.s(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    @Override // ua.a
    public final void zat(a.C0303a c0303a, String str, ArrayList arrayList) {
        b(c0303a);
        p.f(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        int i11 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        int iQ = c1.q(i11, parcel);
        parcel.writeFloatArray(fArr);
        c1.r(iQ, parcel);
    }

    @Override // ua.a
    public final void zaw(a.C0303a c0303a, String str, ArrayList arrayList) {
        b(c0303a);
        p.f(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        c1.i(this.f29675b, c0303a.f29669g, iArr, true);
    }

    @Override // ua.a
    public final void zaz(a.C0303a c0303a, String str, ArrayList arrayList) {
        b(c0303a);
        p.f(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        int i11 = c0303a.f29669g;
        Parcel parcel = this.f29675b;
        int iQ = c1.q(i11, parcel);
        parcel.writeLongArray(jArr);
        c1.r(iQ, parcel);
    }
}
