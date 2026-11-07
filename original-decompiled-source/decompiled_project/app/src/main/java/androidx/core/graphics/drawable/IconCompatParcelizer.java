package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import o6.a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i10 = iconCompat.f1401a;
        if (aVar.h(1)) {
            i10 = aVar.i();
        }
        iconCompat.f1401a = i10;
        byte[] bArrF = iconCompat.f1403c;
        if (aVar.h(2)) {
            bArrF = aVar.f();
        }
        iconCompat.f1403c = bArrF;
        Parcelable parcelableJ = iconCompat.f1404d;
        if (aVar.h(3)) {
            parcelableJ = aVar.j();
        }
        iconCompat.f1404d = parcelableJ;
        int i11 = iconCompat.f1405e;
        if (aVar.h(4)) {
            i11 = aVar.i();
        }
        iconCompat.f1405e = i11;
        int i12 = iconCompat.f1406f;
        if (aVar.h(5)) {
            i12 = aVar.i();
        }
        iconCompat.f1406f = i12;
        Parcelable parcelableJ2 = iconCompat.f1407g;
        if (aVar.h(6)) {
            parcelableJ2 = aVar.j();
        }
        iconCompat.f1407g = (ColorStateList) parcelableJ2;
        String strK = iconCompat.f1409i;
        if (aVar.h(7)) {
            strK = aVar.k();
        }
        iconCompat.f1409i = strK;
        String strK2 = iconCompat.f1410j;
        if (aVar.h(8)) {
            strK2 = aVar.k();
        }
        iconCompat.f1410j = strK2;
        iconCompat.f1408h = PorterDuff.Mode.valueOf(iconCompat.f1409i);
        switch (iconCompat.f1401a) {
            case -1:
                Parcelable parcelable = iconCompat.f1404d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1402b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1404d;
                if (parcelable2 != null) {
                    iconCompat.f1402b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.f1403c;
                iconCompat.f1402b = bArr;
                iconCompat.f1401a = 3;
                iconCompat.f1405e = 0;
                iconCompat.f1406f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f1403c, Charset.forName("UTF-16"));
                iconCompat.f1402b = str;
                if (iconCompat.f1401a == 2 && iconCompat.f1410j == null) {
                    iconCompat.f1410j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1402b = iconCompat.f1403c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1409i = iconCompat.f1408h.name();
        switch (iconCompat.f1401a) {
            case -1:
                iconCompat.f1404d = (Parcelable) iconCompat.f1402b;
                break;
            case 1:
            case 5:
                iconCompat.f1404d = (Parcelable) iconCompat.f1402b;
                break;
            case 2:
                iconCompat.f1403c = ((String) iconCompat.f1402b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1403c = (byte[]) iconCompat.f1402b;
                break;
            case 4:
            case 6:
                iconCompat.f1403c = iconCompat.f1402b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f1401a;
        if (-1 != i10) {
            aVar.m(1);
            aVar.q(i10);
        }
        byte[] bArr = iconCompat.f1403c;
        if (bArr != null) {
            aVar.m(2);
            aVar.o(bArr);
        }
        Parcelable parcelable = iconCompat.f1404d;
        if (parcelable != null) {
            aVar.m(3);
            aVar.r(parcelable);
        }
        int i11 = iconCompat.f1405e;
        if (i11 != 0) {
            aVar.m(4);
            aVar.q(i11);
        }
        int i12 = iconCompat.f1406f;
        if (i12 != 0) {
            aVar.m(5);
            aVar.q(i12);
        }
        ColorStateList colorStateList = iconCompat.f1407g;
        if (colorStateList != null) {
            aVar.m(6);
            aVar.r(colorStateList);
        }
        String str = iconCompat.f1409i;
        if (str != null) {
            aVar.m(7);
            aVar.s(str);
        }
        String str2 = iconCompat.f1410j;
        if (str2 != null) {
            aVar.m(8);
            aVar.s(str2);
        }
    }
}
