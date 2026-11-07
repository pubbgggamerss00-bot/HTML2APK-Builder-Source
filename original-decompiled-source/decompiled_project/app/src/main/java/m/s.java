package m;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f17175a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f17176b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f17177c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f17178d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int[] f17179e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public boolean f17180f = false;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f17181g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f17182h;

    public static class a extends c {
    }

    public static class b extends a {
    }

    public static class c {
    }

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public s(TextView textView) {
        this.f17181g = textView;
        this.f17182h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new b();
        } else {
            new a();
        }
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }
}
