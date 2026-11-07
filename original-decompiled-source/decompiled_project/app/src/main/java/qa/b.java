package qa;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.o;
import j2.y;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import p.g0;

/* loaded from: classes2.dex */
public final class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static BigDecimal a(int i10, Parcel parcel) {
        int iR = r(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i11 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iR);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i11);
    }

    public static Bundle b(int i10, Parcel parcel) {
        int iR = r(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iR);
        return bundle;
    }

    public static byte[] c(int i10, Parcel parcel) {
        int iR = r(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iR);
        return bArrCreateByteArray;
    }

    public static int[] d(int i10, Parcel parcel) {
        int iR = r(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iR);
        return iArrCreateIntArray;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int iR = r(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iR);
        return tCreateFromParcel;
    }

    public static String f(int i10, Parcel parcel) {
        int iR = r(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iR);
        return string;
    }

    public static ArrayList g(int i10, Parcel parcel) {
        int iR = r(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iR);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] h(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int iR = r(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iR);
        return tArr;
    }

    public static <T> ArrayList<T> i(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int iR = r(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iR);
        return arrayListCreateTypedArrayList;
    }

    public static void j(int i10, Parcel parcel) {
        if (parcel.dataPosition() != i10) {
            throw new a(y.a(i10, "Overread allowed size end="), parcel);
        }
    }

    public static boolean k(int i10, Parcel parcel) {
        v(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Double l(int i10, Parcel parcel) {
        int iR = r(i10, parcel);
        if (iR == 0) {
            return null;
        }
        u(parcel, iR, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static IBinder m(int i10, Parcel parcel) {
        int iR = r(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iR);
        return strongBinder;
    }

    public static int n(int i10, Parcel parcel) {
        v(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer o(int i10, Parcel parcel) {
        int iR = r(i10, parcel);
        if (iR == 0) {
            return null;
        }
        u(parcel, iR, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long p(int i10, Parcel parcel) {
        v(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long q(int i10, Parcel parcel) {
        int iR = r(i10, parcel);
        if (iR == 0) {
            return null;
        }
        u(parcel, iR, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int r(int i10, Parcel parcel) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void s(int i10, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + r(i10, parcel));
    }

    public static int t(Parcel parcel) {
        int i10 = parcel.readInt();
        int iR = r(i10, parcel);
        char c10 = (char) i10;
        int iDataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i10))), parcel);
        }
        int i11 = iR + iDataPosition;
        if (i11 < iDataPosition || i11 > parcel.dataSize()) {
            throw new a(e1.c.a(iDataPosition, i11, "Size read is invalid start=", " end="), parcel);
        }
        return i11;
    }

    public static void u(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        throw new a(o.a(g0.a(i11, i10, "Expected size ", " got ", " (0x"), Integer.toHexString(i10), ")"), parcel);
    }

    public static void v(Parcel parcel, int i10, int i11) {
        int iR = r(i10, parcel);
        if (iR == i11) {
            return;
        }
        throw new a(o.a(g0.a(i11, iR, "Expected size ", " got ", " (0x"), Integer.toHexString(iR), ")"), parcel);
    }
}
