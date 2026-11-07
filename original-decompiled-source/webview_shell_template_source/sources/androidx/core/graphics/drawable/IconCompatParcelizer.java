package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import g2.a;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i6 = iconCompat.f966a;
        if (aVar.h(1)) {
            i6 = aVar.i();
        }
        iconCompat.f966a = i6;
        byte[] bArrF = iconCompat.f968c;
        if (aVar.h(2)) {
            bArrF = aVar.f();
        }
        iconCompat.f968c = bArrF;
        Parcelable parcelableJ = iconCompat.f969d;
        if (aVar.h(3)) {
            parcelableJ = aVar.j();
        }
        iconCompat.f969d = parcelableJ;
        int i7 = iconCompat.f970e;
        if (aVar.h(4)) {
            i7 = aVar.i();
        }
        iconCompat.f970e = i7;
        int i8 = iconCompat.f971f;
        if (aVar.h(5)) {
            i8 = aVar.i();
        }
        iconCompat.f971f = i8;
        Parcelable parcelableJ2 = iconCompat.f972g;
        if (aVar.h(6)) {
            parcelableJ2 = aVar.j();
        }
        iconCompat.f972g = (ColorStateList) parcelableJ2;
        String strK = iconCompat.f973i;
        if (aVar.h(7)) {
            strK = aVar.k();
        }
        iconCompat.f973i = strK;
        String strK2 = iconCompat.f974j;
        if (aVar.h(8)) {
            strK2 = aVar.k();
        }
        iconCompat.f974j = strK2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.f973i);
        switch (iconCompat.f966a) {
            case -1:
                Parcelable parcelable = iconCompat.f969d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f967b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f969d;
                if (parcelable2 != null) {
                    iconCompat.f967b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.f968c;
                iconCompat.f967b = bArr;
                iconCompat.f966a = 3;
                iconCompat.f970e = 0;
                iconCompat.f971f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f968c, Charset.forName("UTF-16"));
                iconCompat.f967b = str;
                if (iconCompat.f966a == 2 && iconCompat.f974j == null) {
                    iconCompat.f974j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f967b = iconCompat.f968c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f973i = iconCompat.h.name();
        switch (iconCompat.f966a) {
            case -1:
                iconCompat.f969d = (Parcelable) iconCompat.f967b;
                break;
            case 1:
            case 5:
                iconCompat.f969d = (Parcelable) iconCompat.f967b;
                break;
            case 2:
                iconCompat.f968c = ((String) iconCompat.f967b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f968c = (byte[]) iconCompat.f967b;
                break;
            case 4:
            case 6:
                iconCompat.f968c = iconCompat.f967b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i6 = iconCompat.f966a;
        if (-1 != i6) {
            aVar.m(1);
            aVar.q(i6);
        }
        byte[] bArr = iconCompat.f968c;
        if (bArr != null) {
            aVar.m(2);
            aVar.o(bArr);
        }
        Parcelable parcelable = iconCompat.f969d;
        if (parcelable != null) {
            aVar.m(3);
            aVar.r(parcelable);
        }
        int i7 = iconCompat.f970e;
        if (i7 != 0) {
            aVar.m(4);
            aVar.q(i7);
        }
        int i8 = iconCompat.f971f;
        if (i8 != 0) {
            aVar.m(5);
            aVar.q(i8);
        }
        ColorStateList colorStateList = iconCompat.f972g;
        if (colorStateList != null) {
            aVar.m(6);
            aVar.r(colorStateList);
        }
        String str = iconCompat.f973i;
        if (str != null) {
            aVar.m(7);
            aVar.s(str);
        }
        String str2 = iconCompat.f974j;
        if (str2 != null) {
            aVar.m(8);
            aVar.s(str2);
        }
    }
}
