package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface np0 {
    void a(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void b(View view);

    void c();

    boolean d(Bundle bundle);

    void e(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void f(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType);

    void g(Bundle bundle);

    void h(View view);

    void i(Bundle bundle);

    void j(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType, int i6);

    void k(String str);

    void l(ss ssVar);

    JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void n(zzdd zzddVar);

    void o(MotionEvent motionEvent, View view);

    boolean p();

    void q(zzdh zzdhVar);

    JSONObject r(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    boolean zzB();

    int zza();

    void zzi();

    void zzj();

    void zzq();

    void zzs();
}
