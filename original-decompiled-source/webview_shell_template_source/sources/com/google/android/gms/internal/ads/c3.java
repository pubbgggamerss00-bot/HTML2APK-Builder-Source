package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f3385a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3386b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f3387c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static cp1 a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        yn1 yn1Var = new yn1();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (y5.m(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strE = y5.e(xmlPullParser, strConcat2);
                String strE2 = y5.e(xmlPullParser, strConcat3);
                String strE3 = y5.e(xmlPullParser, strConcat4);
                String strE4 = y5.e(xmlPullParser, strConcat5);
                if (strE == null || strE2 == null) {
                    zn1 zn1Var = bo1.f3236t;
                    return cp1.f3636w;
                }
                yn1Var.q(new x2(strE, strE3 != null ? Long.parseLong(strE3) : 0L, strE4 != null ? Long.parseLong(strE4) : 0L));
            }
        } while (!y5.i(xmlPullParser, str.concat(":Directory")));
        return yn1Var.t();
    }
}
