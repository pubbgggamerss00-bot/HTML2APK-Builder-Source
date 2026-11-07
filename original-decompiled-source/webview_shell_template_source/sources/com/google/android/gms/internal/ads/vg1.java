package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vg1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f9860b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9861a = new ArrayList();

    public final void a(View view, hg1 hg1Var) {
        ug1 ug1Var;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f9860b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.f9861a;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                ug1Var = null;
                break;
            }
            Object obj = arrayList.get(i6);
            i6++;
            ug1Var = (ug1) obj;
            if (ug1Var.f9555a.get() == view) {
                break;
            }
        }
        if (ug1Var == null) {
            arrayList.add(new ug1(view, hg1Var));
        }
    }
}
