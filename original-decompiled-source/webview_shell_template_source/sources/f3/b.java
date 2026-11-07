package f3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(iDataPosition);
            sb.append(" size=");
            sb.append(iDataSize);
            super(sb.toString());
        }
    }

    public static Bundle a(int i6, Parcel parcel) {
        int iM = m(i6, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM);
        return bundle;
    }

    public static byte[] b(int i6, Parcel parcel) {
        int iM = m(i6, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM);
        return bArrCreateByteArray;
    }

    public static <T extends Parcelable> T c(Parcel parcel, int i6, Parcelable.Creator<T> creator) {
        int iM = m(i6, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM);
        return tCreateFromParcel;
    }

    public static String d(int i6, Parcel parcel) {
        int iM = m(i6, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM);
        return string;
    }

    public static String[] e(int i6, Parcel parcel) {
        int iM = m(i6, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iM);
        return strArrCreateStringArray;
    }

    public static ArrayList f(int i6, Parcel parcel) {
        int iM = m(i6, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iM);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] g(Parcel parcel, int i6, Parcelable.Creator<T> creator) {
        int iM = m(i6, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM);
        return tArr;
    }

    public static void h(int i6, Parcel parcel) {
        if (parcel.dataPosition() == i6) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i6);
        throw new a(sb.toString(), parcel);
    }

    public static boolean i(int i6, Parcel parcel) {
        p(parcel, i6, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder j(int i6, Parcel parcel) {
        int iM = m(i6, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM);
        return strongBinder;
    }

    public static int k(int i6, Parcel parcel) {
        p(parcel, i6, 4);
        return parcel.readInt();
    }

    public static long l(int i6, Parcel parcel) {
        p(parcel, i6, 8);
        return parcel.readLong();
    }

    public static int m(int i6, Parcel parcel) {
        return (i6 & (-65536)) != -65536 ? (char) (i6 >> 16) : parcel.readInt();
    }

    public static void n(int i6, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + m(i6, parcel));
    }

    public static int o(Parcel parcel) {
        int i6 = parcel.readInt();
        int iM = m(i6, parcel);
        char c7 = (char) i6;
        int iDataPosition = parcel.dataPosition();
        if (c7 != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i6))), parcel);
        }
        int i7 = iM + iDataPosition;
        if (i7 >= iDataPosition && i7 <= parcel.dataSize()) {
            return i7;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i7).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i7);
        throw new a(sb.toString(), parcel);
    }

    public static void p(Parcel parcel, int i6, int i7) {
        int iM = m(i6, parcel);
        if (iM == i7) {
            return;
        }
        String hexString = Integer.toHexString(iM);
        int length = String.valueOf(i7).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iM).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i7);
        sb.append(" got ");
        sb.append(iM);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }
}
