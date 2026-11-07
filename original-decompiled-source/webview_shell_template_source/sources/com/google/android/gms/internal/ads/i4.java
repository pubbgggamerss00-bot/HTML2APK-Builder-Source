package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i4 extends z3 {
    public static final Parcelable.Creator<i4> CREATOR = new h4();

    /* renamed from: t, reason: collision with root package name */
    public final String f5546t;

    /* renamed from: u, reason: collision with root package name */
    public final bo1 f5547u;

    public i4(String str, String str2, cp1 cp1Var) {
        super(str);
        y5.n(!cp1Var.isEmpty());
        this.f5546t = str2;
        bo1 bo1VarL = bo1.l(cp1Var);
        this.f5547u = bo1VarL;
    }

    public static ArrayList l(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0202 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x0295, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x0295, blocks: (B:113:0x01b0, B:126:0x01f9, B:128:0x0202, B:129:0x020c, B:145:0x0250), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    @Override // com.google.android.gms.internal.ads.z3, com.google.android.gms.internal.ads.zg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ae aeVar) throws NumberFormatException {
        byte b7;
        Long lValueOf;
        byte b8;
        String str = this.s;
        int iHashCode = str.hashCode();
        bo1 bo1Var = this.f5547u;
        try {
            switch (iHashCode) {
                case 82815:
                    if (!str.equals("TAL")) {
                    }
                    aeVar.f2673c = (CharSequence) bo1Var.get(0);
                    break;
                case 82878:
                    if (!str.equals("TCM")) {
                    }
                    aeVar.s = (CharSequence) bo1Var.get(0);
                    break;
                case 82897:
                    if (!str.equals("TDA")) {
                    }
                    String str2 = (String) bo1Var.get(0);
                    int i6 = Integer.parseInt(str2.substring(2, 4));
                    int i7 = Integer.parseInt(str2.substring(0, 2));
                    aeVar.f2682m = Integer.valueOf(i6);
                    aeVar.f2683n = Integer.valueOf(i7);
                    break;
                case 83253:
                    if (!str.equals("TP1")) {
                    }
                    aeVar.f2672b = (CharSequence) bo1Var.get(0);
                    break;
                case 83254:
                    if (!str.equals("TP2")) {
                    }
                    aeVar.f2674d = (CharSequence) bo1Var.get(0);
                    break;
                case 83255:
                    if (!str.equals("TP3")) {
                    }
                    aeVar.f2688t = (CharSequence) bo1Var.get(0);
                    break;
                case 83341:
                    if (!str.equals("TRK")) {
                    }
                    String str3 = (String) bo1Var.get(0);
                    int i8 = j31.f5914a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i9 = Integer.parseInt(strArrSplit[0]);
                    numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    aeVar.h = Integer.valueOf(i9);
                    aeVar.f2678i = numValueOf;
                    break;
                case 83378:
                    if (!str.equals("TT2")) {
                    }
                    aeVar.f2671a = (CharSequence) bo1Var.get(0);
                    break;
                case 83536:
                    if (!str.equals("TXT")) {
                    }
                    aeVar.f2687r = (CharSequence) bo1Var.get(0);
                    break;
                case 83552:
                    if (!str.equals("TYE")) {
                    }
                    aeVar.f2681l = Integer.valueOf(Integer.parseInt((String) bo1Var.get(0)));
                    break;
                case 2567331:
                    if (!str.equals("TALB")) {
                    }
                    aeVar.f2673c = (CharSequence) bo1Var.get(0);
                    break;
                case 2569357:
                    if (!str.equals("TCOM")) {
                    }
                    aeVar.s = (CharSequence) bo1Var.get(0);
                    break;
                case 2569358:
                    if (str.equals("TCON")) {
                        String str4 = (String) bo1Var.get(0);
                        str4.getClass();
                        if (!str4.isEmpty()) {
                            char cCharAt = str4.charAt(0);
                            int i10 = cCharAt != '-' ? 0 : 1;
                            if (i10 == str4.length()) {
                                lValueOf = null;
                            } else {
                                int i11 = i10 + 1;
                                char cCharAt2 = str4.charAt(i10);
                                char c7 = 128;
                                if (cCharAt2 < 128) {
                                    b7 = nq1.f7491a[cCharAt2];
                                } else {
                                    byte[] bArr = nq1.f7491a;
                                    b7 = -1;
                                }
                                if (b7 >= 0) {
                                    byte b9 = 10;
                                    if (b7 < 10) {
                                        long j6 = -b7;
                                        while (true) {
                                            if (i11 < str4.length()) {
                                                int i12 = i11 + 1;
                                                char cCharAt3 = str4.charAt(i11);
                                                if (cCharAt3 < c7) {
                                                    b8 = nq1.f7491a[cCharAt3];
                                                } else {
                                                    byte[] bArr2 = nq1.f7491a;
                                                    b8 = -1;
                                                }
                                                if (b8 >= 0 && b8 < b9 && j6 >= -922337203685477580L) {
                                                    long j7 = j6 * 10;
                                                    long j8 = b8;
                                                    if (j7 >= Long.MIN_VALUE + j8) {
                                                        j6 = j7 - j8;
                                                        i11 = i12;
                                                        c7 = 128;
                                                        b9 = 10;
                                                    }
                                                }
                                            } else if (cCharAt == '-') {
                                                lValueOf = Long.valueOf(j6);
                                            } else if (j6 != Long.MIN_VALUE) {
                                                lValueOf = Long.valueOf(-j6);
                                            }
                                        }
                                        lValueOf = null;
                                    }
                                }
                            }
                        }
                        if (lValueOf != null && lValueOf.longValue() == lValueOf.intValue()) {
                            numValueOf = Integer.valueOf(lValueOf.intValue());
                        }
                        if (numValueOf != null) {
                            String strA = a4.a(numValueOf.intValue());
                            if (strA != null) {
                                aeVar.f2689u = strA;
                                break;
                            }
                        } else {
                            aeVar.f2689u = (CharSequence) bo1Var.get(0);
                            break;
                        }
                    }
                    break;
                case 2569891:
                    if (!str.equals("TDAT")) {
                    }
                    String str22 = (String) bo1Var.get(0);
                    int i62 = Integer.parseInt(str22.substring(2, 4));
                    int i72 = Integer.parseInt(str22.substring(0, 2));
                    aeVar.f2682m = Integer.valueOf(i62);
                    aeVar.f2683n = Integer.valueOf(i72);
                    break;
                case 2570401:
                    if (str.equals("TDRC")) {
                        ArrayList arrayListL = l((String) bo1Var.get(0));
                        int size = arrayListL.size();
                        if (size != 1) {
                            if (size != 2) {
                                if (size == 3) {
                                    aeVar.f2683n = (Integer) arrayListL.get(2);
                                }
                            }
                            aeVar.f2682m = (Integer) arrayListL.get(1);
                        }
                        aeVar.f2681l = (Integer) arrayListL.get(0);
                        break;
                    }
                    break;
                case 2570410:
                    if (str.equals("TDRL")) {
                        ArrayList arrayListL2 = l((String) bo1Var.get(0));
                        int size2 = arrayListL2.size();
                        if (size2 != 1) {
                            if (size2 != 2) {
                                if (size2 == 3) {
                                    aeVar.f2686q = (Integer) arrayListL2.get(2);
                                }
                            }
                            aeVar.f2685p = (Integer) arrayListL2.get(1);
                        }
                        aeVar.f2684o = (Integer) arrayListL2.get(0);
                        break;
                    }
                    break;
                case 2571565:
                    if (!str.equals("TEXT")) {
                    }
                    aeVar.f2687r = (CharSequence) bo1Var.get(0);
                    break;
                case 2575251:
                    if (!str.equals("TIT2")) {
                    }
                    aeVar.f2671a = (CharSequence) bo1Var.get(0);
                    break;
                case 2581512:
                    if (!str.equals("TPE1")) {
                    }
                    aeVar.f2672b = (CharSequence) bo1Var.get(0);
                    break;
                case 2581513:
                    if (!str.equals("TPE2")) {
                    }
                    aeVar.f2674d = (CharSequence) bo1Var.get(0);
                    break;
                case 2581514:
                    if (!str.equals("TPE3")) {
                    }
                    aeVar.f2688t = (CharSequence) bo1Var.get(0);
                    break;
                case 2583398:
                    if (!str.equals("TRCK")) {
                    }
                    String str32 = (String) bo1Var.get(0);
                    int i82 = j31.f5914a;
                    String[] strArrSplit2 = str32.split("/", -1);
                    int i92 = Integer.parseInt(strArrSplit2[0]);
                    if (strArrSplit2.length > 1) {
                    }
                    aeVar.h = Integer.valueOf(i92);
                    aeVar.f2678i = numValueOf;
                    break;
                case 2590194:
                    if (!str.equals("TYER")) {
                    }
                    aeVar.f2681l = Integer.valueOf(Integer.parseInt((String) bo1Var.get(0)));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i4.class == obj.getClass()) {
            i4 i4Var = (i4) obj;
            if (Objects.equals(this.s, i4Var.s) && Objects.equals(this.f5546t, i4Var.f5546t) && this.f5547u.equals(i4Var.f5547u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.s.hashCode() + 527;
        String str = this.f5546t;
        return this.f5547u.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final String toString() {
        return this.s + ": description=" + this.f5546t + ": values=" + String.valueOf(this.f5547u);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.s);
        parcel.writeString(this.f5546t);
        parcel.writeStringArray((String[]) this.f5547u.toArray(new String[0]));
    }
}
