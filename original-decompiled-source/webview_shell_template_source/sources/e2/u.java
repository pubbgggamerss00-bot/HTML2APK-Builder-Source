package e2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.htmltoapk.template.R;
import e2.f;
import e2.l;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class u extends f {
    public static final String[] T = {"android:visibility:visibility", "android:visibility:parent"};
    public int S = 3;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends AnimatorListenerAdapter implements f.d {

        /* renamed from: a, reason: collision with root package name */
        public final View f12833a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12834b;

        /* renamed from: c, reason: collision with root package name */
        public final ViewGroup f12835c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f12837e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f12838f = false;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f12836d = true;

        public a(View view, int i6) {
            this.f12833a = view;
            this.f12834b = i6;
            this.f12835c = (ViewGroup) view.getParent();
            h(true);
        }

        @Override // e2.f.d
        public final void a() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            h(false);
            if (this.f12838f) {
                return;
            }
            o.b(this.f12833a, this.f12834b);
        }

        @Override // e2.f.d
        public final void d(f fVar) {
            fVar.w(this);
        }

        @Override // e2.f.d
        public final void e() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            h(true);
            if (this.f12838f) {
                return;
            }
            o.b(this.f12833a, 0);
        }

        public final void h(boolean z6) {
            ViewGroup viewGroup;
            if (!this.f12836d || this.f12837e == z6 || (viewGroup = this.f12835c) == null) {
                return;
            }
            this.f12837e = z6;
            n.a(viewGroup, z6);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f12838f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (!this.f12838f) {
                o.b(this.f12833a, this.f12834b);
                ViewGroup viewGroup = this.f12835c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            h(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z6) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z6) {
                o.b(this.f12833a, 0);
                ViewGroup viewGroup = this.f12835c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z6) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z6) {
                return;
            }
            if (!this.f12838f) {
                o.b(this.f12833a, this.f12834b);
                ViewGroup viewGroup = this.f12835c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            h(false);
        }

        @Override // e2.f.d
        public final void c(f fVar) {
        }

        @Override // e2.f.d
        public final void g(f fVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends AnimatorListenerAdapter implements f.d {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f12839a;

        /* renamed from: b, reason: collision with root package name */
        public final View f12840b;

        /* renamed from: c, reason: collision with root package name */
        public final View f12841c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f12842d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.f12839a = viewGroup;
            this.f12840b = view;
            this.f12841c = view2;
        }

        @Override // e2.f.d
        public final void c(f fVar) {
            if (this.f12842d) {
                h();
            }
        }

        @Override // e2.f.d
        public final void d(f fVar) {
            fVar.w(this);
        }

        public final void h() {
            this.f12841c.setTag(R.id.save_overlay_view, null);
            this.f12839a.getOverlay().remove(this.f12840b);
            this.f12842d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.f12839a.getOverlay().remove(this.f12840b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.f12840b;
            if (view.getParent() == null) {
                this.f12839a.getOverlay().add(view);
            } else {
                u.this.c();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z6) {
            if (z6) {
                View view = this.f12841c;
                View view2 = this.f12840b;
                view.setTag(R.id.save_overlay_view, view2);
                this.f12839a.getOverlay().add(view2);
                this.f12842d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z6) {
            if (z6) {
                return;
            }
            h();
        }

        @Override // e2.f.d
        public final void a() {
        }

        @Override // e2.f.d
        public final void e() {
        }

        @Override // e2.f.d
        public final void g(f fVar) {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f12844a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f12845b;

        /* renamed from: c, reason: collision with root package name */
        public int f12846c;

        /* renamed from: d, reason: collision with root package name */
        public int f12847d;

        /* renamed from: e, reason: collision with root package name */
        public ViewGroup f12848e;

        /* renamed from: f, reason: collision with root package name */
        public ViewGroup f12849f;
    }

    public static void H(m mVar) {
        View view = mVar.f12821b;
        int visibility = view.getVisibility();
        HashMap map = mVar.f12820a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c I(m mVar, m mVar2) {
        c cVar = new c();
        cVar.f12844a = false;
        cVar.f12845b = false;
        if (mVar != null) {
            HashMap map = mVar.f12820a;
            if (map.containsKey("android:visibility:visibility")) {
                cVar.f12846c = ((Integer) map.get("android:visibility:visibility")).intValue();
                cVar.f12848e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                cVar.f12846c = -1;
                cVar.f12848e = null;
            }
        }
        if (mVar2 != null) {
            HashMap map2 = mVar2.f12820a;
            if (map2.containsKey("android:visibility:visibility")) {
                cVar.f12847d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                cVar.f12849f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                cVar.f12847d = -1;
                cVar.f12849f = null;
            }
        }
        if (mVar != null && mVar2 != null) {
            int i6 = cVar.f12846c;
            int i7 = cVar.f12847d;
            if (i6 != i7 || cVar.f12848e != cVar.f12849f) {
                if (i6 != i7) {
                    if (i6 == 0) {
                        cVar.f12845b = false;
                        cVar.f12844a = true;
                        return cVar;
                    }
                    if (i7 == 0) {
                        cVar.f12845b = true;
                        cVar.f12844a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f12849f == null) {
                        cVar.f12845b = false;
                        cVar.f12844a = true;
                        return cVar;
                    }
                    if (cVar.f12848e == null) {
                        cVar.f12845b = true;
                        cVar.f12844a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (mVar == null && cVar.f12847d == 0) {
                cVar.f12845b = true;
                cVar.f12844a = true;
                return cVar;
            }
            if (mVar2 == null && cVar.f12846c == 0) {
                cVar.f12845b = false;
                cVar.f12844a = true;
            }
        }
        return cVar;
    }

    @Override // e2.f
    public final void d(m mVar) {
        H(mVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (I(n(r3, false), r(r3, false)).f12844a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021d  */
    @Override // e2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, m mVar, m mVar2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        boolean z6;
        View view;
        int i6;
        char c7;
        int i7;
        View view2;
        Animator animator;
        View view3;
        boolean z7;
        ViewGroup viewGroup2;
        int i8;
        Bitmap bitmapCreateBitmap;
        c cVarI = I(mVar, mVar2);
        if (cVarI.f12844a && (cVarI.f12848e != null || cVarI.f12849f != null)) {
            int i9 = 1;
            if (!cVarI.f12845b) {
                int i10 = cVarI.f12847d;
                if ((this.S & 2) == 2 && mVar != null) {
                    View view4 = mVar.f12821b;
                    View view5 = mVar2 != null ? mVar2.f12821b : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i6 = i10;
                        c7 = 1;
                        i7 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z6 = false;
                            }
                            view = null;
                            if (!z6) {
                                i6 = i10;
                                c7 = 1;
                                i7 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i9 = i7;
                                view3 = view2;
                            } else if (view4.getParent() == null) {
                                i6 = i10;
                                c7 = 1;
                                i9 = 0;
                                i7 = 0;
                                view3 = view;
                                animator = null;
                                view6 = view4;
                            } else {
                                if (view4.getParent() instanceof View) {
                                    View view7 = (View) view4.getParent();
                                    animator = null;
                                    i7 = 0;
                                    if (I(r(view7, true), n(view7, true)).f12844a) {
                                        i6 = i10;
                                        c7 = 1;
                                        view2 = view;
                                        int id = view7.getId();
                                        if (view7.getParent() == null && id != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                    } else {
                                        boolean z8 = l.f12819a;
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                        s sVar = o.f12824a;
                                        sVar.d(view4, matrix);
                                        sVar.e(viewGroup, matrix);
                                        RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                                        matrix.mapRect(rectF);
                                        int iRound = Math.round(rectF.left);
                                        int iRound2 = Math.round(rectF.top);
                                        c7 = 1;
                                        int iRound3 = Math.round(rectF.right);
                                        int iRound4 = Math.round(rectF.bottom);
                                        ImageView imageView = new ImageView(view4.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        boolean zIsAttachedToWindow = view4.isAttachedToWindow();
                                        boolean z9 = viewGroup != null && viewGroup.isAttachedToWindow();
                                        if (zIsAttachedToWindow) {
                                            z7 = zIsAttachedToWindow;
                                            viewGroup2 = null;
                                            i8 = 0;
                                        } else if (z9) {
                                            ViewGroup viewGroup3 = (ViewGroup) view4.getParent();
                                            int iIndexOfChild = viewGroup3.indexOfChild(view4);
                                            viewGroup.getOverlay().add(view4);
                                            z7 = zIsAttachedToWindow;
                                            i8 = iIndexOfChild;
                                            viewGroup2 = viewGroup3;
                                        } else {
                                            i6 = i10;
                                            view2 = view;
                                            bitmapCreateBitmap = null;
                                            if (bitmapCreateBitmap != null) {
                                                imageView.setImageBitmap(bitmapCreateBitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                                            view6 = imageView;
                                            i9 = i7;
                                            view3 = view2;
                                        }
                                        view2 = view;
                                        int iRound5 = Math.round(rectF.width());
                                        i6 = i10;
                                        int iRound6 = Math.round(rectF.height());
                                        if (iRound5 <= 0 || iRound6 <= 0) {
                                            bitmapCreateBitmap = null;
                                        } else {
                                            float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                            int iRound7 = Math.round(iRound5 * fMin);
                                            int iRound8 = Math.round(iRound6 * fMin);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(fMin, fMin);
                                            if (l.f12819a) {
                                                Picture picture = new Picture();
                                                Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                                canvasBeginRecording.concat(matrix);
                                                view4.draw(canvasBeginRecording);
                                                picture.endRecording();
                                                bitmapCreateBitmap = l.a.a(picture);
                                            } else {
                                                bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                                canvas.concat(matrix);
                                                view4.draw(canvas);
                                            }
                                        }
                                        if (!z7) {
                                            viewGroup.getOverlay().remove(view4);
                                            viewGroup2.addView(view4, i8);
                                        }
                                        if (bitmapCreateBitmap != null) {
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                        imageView.layout(iRound, iRound2, iRound3, iRound4);
                                        view6 = imageView;
                                        i9 = i7;
                                        view3 = view2;
                                    }
                                }
                                view6 = view5;
                                i9 = i7;
                                view3 = view2;
                            }
                        } else if (i10 == 4 || view4 == view5) {
                            z6 = false;
                            view = view5;
                            view5 = null;
                            if (!z6) {
                            }
                        }
                        z6 = true;
                        view5 = null;
                        view = null;
                        if (!z6) {
                        }
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        o.b(view3, i7);
                        s sVar2 = o.f12824a;
                        sVar2.getClass();
                        ObjectAnimator objectAnimatorJ = ((e2.c) this).J(view3, e2.c.K(mVar, 1.0f), 0.0f);
                        if (objectAnimatorJ == null) {
                            sVar2.b(view3, e2.c.K(mVar2, 1.0f));
                        }
                        if (objectAnimatorJ == null) {
                            o.b(view3, visibility);
                            return objectAnimatorJ;
                        }
                        a aVar = new a(view3, i6);
                        objectAnimatorJ.addListener(aVar);
                        o().a(aVar);
                        return objectAnimatorJ;
                    }
                    if (i9 == 0) {
                        int[] iArr = (int[]) mVar.f12820a.get("android:visibility:screenLocation");
                        int i11 = iArr[i7];
                        int i12 = iArr[c7];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i11 - iArr2[i7]) - view6.getLeft());
                        view6.offsetTopAndBottom((i12 - iArr2[c7]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    s sVar3 = o.f12824a;
                    sVar3.getClass();
                    ObjectAnimator objectAnimatorJ2 = ((e2.c) this).J(view6, e2.c.K(mVar, 1.0f), 0.0f);
                    if (objectAnimatorJ2 == null) {
                        sVar3.b(view6, e2.c.K(mVar2, 1.0f));
                    }
                    if (i9 != 0) {
                        return objectAnimatorJ2;
                    }
                    if (objectAnimatorJ2 == null) {
                        viewGroup.getOverlay().remove(view6);
                        return objectAnimatorJ2;
                    }
                    view4.setTag(R.id.save_overlay_view, view6);
                    b bVar = new b(viewGroup, view6, view4);
                    objectAnimatorJ2.addListener(bVar);
                    objectAnimatorJ2.addPauseListener(bVar);
                    o().a(bVar);
                    return objectAnimatorJ2;
                }
            } else if ((this.S & 1) == 1 && mVar2 != null) {
                View view8 = mVar2.f12821b;
                if (mVar == null) {
                    View view9 = (View) view8.getParent();
                }
                o.f12824a.getClass();
                return ((e2.c) this).J(view8, e2.c.K(mVar, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // e2.f
    public final String[] q() {
        return T;
    }

    @Override // e2.f
    public final boolean s(m mVar, m mVar2) {
        if (mVar == null && mVar2 == null) {
            return false;
        }
        if (mVar != null && mVar2 != null && mVar2.f12820a.containsKey("android:visibility:visibility") != mVar.f12820a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarI = I(mVar, mVar2);
        if (cVarI.f12844a) {
            return cVarI.f12846c == 0 || cVarI.f12847d == 0;
        }
        return false;
    }
}
