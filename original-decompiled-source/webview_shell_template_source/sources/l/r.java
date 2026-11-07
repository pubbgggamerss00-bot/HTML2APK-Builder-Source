package l;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class r {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f13715c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final AbsSeekBar f13716a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f13717b;

    public r(AbsSeekBar absSeekBar) {
        this.f13716a = absSeekBar;
    }

    public void a(AttributeSet attributeSet, int i6) {
        AbsSeekBar absSeekBar = this.f13716a;
        b1 b1VarE = b1.e(i6, 0, absSeekBar.getContext(), attributeSet, f13715c);
        Drawable drawableC = b1VarE.c(0);
        if (drawableC != null) {
            if (drawableC instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableC;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i7 = 0; i7 < numberOfFrames; i7++) {
                    Drawable drawableB = b(animationDrawable.getFrame(i7), true);
                    drawableB.setLevel(10000);
                    animationDrawable2.addFrame(drawableB, animationDrawable.getDuration(i7));
                }
                animationDrawable2.setLevel(10000);
                drawableC = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableC);
        }
        Drawable drawableC2 = b1VarE.c(1);
        if (drawableC2 != null) {
            absSeekBar.setProgressDrawable(b(drawableC2, false));
        }
        b1VarE.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable b(Drawable drawable, boolean z6) {
        if (drawable instanceof n0.b) {
            n0.b bVar = (n0.b) drawable;
            Drawable drawableB = bVar.b();
            if (drawableB != null) {
                bVar.a(b(drawableB, z6));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i6 = 0; i6 < numberOfLayers; i6++) {
                    int id = layerDrawable.getId(i6);
                    drawableArr[i6] = b(layerDrawable.getDrawable(i6), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    layerDrawable2.setId(i7, layerDrawable.getId(i7));
                    layerDrawable2.setLayerGravity(i7, layerDrawable.getLayerGravity(i7));
                    layerDrawable2.setLayerWidth(i7, layerDrawable.getLayerWidth(i7));
                    layerDrawable2.setLayerHeight(i7, layerDrawable.getLayerHeight(i7));
                    layerDrawable2.setLayerInsetLeft(i7, layerDrawable.getLayerInsetLeft(i7));
                    layerDrawable2.setLayerInsetRight(i7, layerDrawable.getLayerInsetRight(i7));
                    layerDrawable2.setLayerInsetTop(i7, layerDrawable.getLayerInsetTop(i7));
                    layerDrawable2.setLayerInsetBottom(i7, layerDrawable.getLayerInsetBottom(i7));
                    layerDrawable2.setLayerInsetStart(i7, layerDrawable.getLayerInsetStart(i7));
                    layerDrawable2.setLayerInsetEnd(i7, layerDrawable.getLayerInsetEnd(i7));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f13717b == null) {
                    this.f13717b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z6 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
