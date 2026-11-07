package v;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29799a = a.f29800a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f29800a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final s.l1 f29801b = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);

        /* renamed from: c, reason: collision with root package name */
        public static final C0304a f29802c = new C0304a();

        /* renamed from: v.d$a$a, reason: collision with other inner class name */
        public static final class C0304a implements d {
        }
    }

    default float a(float f10, float f11, float f12) {
        f29799a.getClass();
        float f13 = f11 + f10;
        if ((f10 >= CropImageView.DEFAULT_ASPECT_RATIO && f13 <= f12) || (f10 < CropImageView.DEFAULT_ASPECT_RATIO && f13 > f12)) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float f14 = f13 - f12;
        return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
    }
}
