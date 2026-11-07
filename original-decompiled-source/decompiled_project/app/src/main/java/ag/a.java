package ag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import bg.e;
import com.yalantis.ucrop.view.CropImageView;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.nio.channels.FileChannel;
import zf.d;

/* loaded from: classes2.dex */
public final class a extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f537a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f538b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f539c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f540d;

    /* renamed from: e, reason: collision with root package name */
    public float f541e;

    /* renamed from: f, reason: collision with root package name */
    public final float f542f;

    /* renamed from: g, reason: collision with root package name */
    public final int f543g;

    /* renamed from: h, reason: collision with root package name */
    public final int f544h;

    /* renamed from: i, reason: collision with root package name */
    public final Bitmap.CompressFormat f545i;

    /* renamed from: j, reason: collision with root package name */
    public final int f546j;

    /* renamed from: k, reason: collision with root package name */
    public final String f547k;

    /* renamed from: l, reason: collision with root package name */
    public final String f548l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f549m;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f550n;

    /* renamed from: o, reason: collision with root package name */
    public final yf.a f551o;

    /* renamed from: p, reason: collision with root package name */
    public int f552p;

    /* renamed from: q, reason: collision with root package name */
    public int f553q;

    /* renamed from: r, reason: collision with root package name */
    public int f554r;

    /* renamed from: s, reason: collision with root package name */
    public int f555s;

    public a(Context context, Bitmap bitmap, d dVar, zf.b bVar, yf.a aVar) {
        this.f537a = new WeakReference<>(context);
        this.f538b = bitmap;
        this.f539c = dVar.f35070a;
        this.f540d = dVar.f35071b;
        this.f541e = dVar.f35072c;
        this.f542f = dVar.f35073d;
        this.f543g = bVar.f35059a;
        this.f544h = bVar.f35060b;
        this.f545i = bVar.f35061c;
        this.f546j = bVar.f35062d;
        this.f547k = bVar.f35063e;
        this.f548l = bVar.f35064f;
        this.f549m = bVar.f35065g;
        this.f550n = bVar.f35066h;
        this.f551o = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0235 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0243 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019d  */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x01fc -> B:204:0x0312). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() throws Throwable {
        boolean z10;
        OutputStream outputStream;
        Closeable closeable;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        InputStream inputStreamOpenInputStream;
        WeakReference<Context> weakReference = this.f537a;
        Context context = weakReference.get();
        if (context == null) {
            return;
        }
        int i10 = this.f543g;
        int i11 = this.f544h;
        boolean z11 = false;
        RectF rectF = this.f539c;
        if (i10 > 0 && i11 > 0) {
            float fWidth = rectF.width() / this.f541e;
            float fHeight = rectF.height() / this.f541e;
            float f10 = i10;
            if (fWidth > f10 || fHeight > i11) {
                float fMin = Math.min(f10 / fWidth, i11 / fHeight);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.f538b, Math.round(r7.getWidth() * fMin), Math.round(this.f538b.getHeight() * fMin), false);
                Bitmap bitmap = this.f538b;
                if (bitmap != bitmapCreateScaledBitmap) {
                    bitmap.recycle();
                }
                this.f538b = bitmapCreateScaledBitmap;
                this.f541e /= fMin;
            }
        }
        float f11 = this.f542f;
        if (f11 != CropImageView.DEFAULT_ASPECT_RATIO) {
            Matrix matrix = new Matrix();
            matrix.setRotate(f11, this.f538b.getWidth() / 2, this.f538b.getHeight() / 2);
            Bitmap bitmap2 = this.f538b;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.f538b.getHeight(), matrix, true);
            Bitmap bitmap3 = this.f538b;
            if (bitmap3 != bitmapCreateBitmap) {
                bitmap3.recycle();
            }
            this.f538b = bitmapCreateBitmap;
        }
        float f12 = rectF.left;
        RectF rectF2 = this.f540d;
        this.f554r = Math.round((f12 - rectF2.left) / this.f541e);
        this.f555s = Math.round((rectF.top - rectF2.top) / this.f541e);
        this.f552p = Math.round(rectF.width() / this.f541e);
        this.f553q = Math.round(rectF.height() / this.f541e);
        int iRound = Math.round(Math.max(this.f552p, r6) / 1000.0f) + 1;
        if (i10 <= 0 || i11 <= 0) {
            float f13 = iRound;
            z10 = Math.abs(rectF.left - rectF2.left) > f13 || Math.abs(rectF.top - rectF2.top) > f13 || Math.abs(rectF.bottom - rectF2.bottom) > f13 || Math.abs(rectF.right - rectF2.right) > f13 || f11 != CropImageView.DEFAULT_ASPECT_RATIO;
        }
        Log.i("BitmapCropTask", "Should crop: " + z10);
        Uri uri = this.f549m;
        Uri uri2 = this.f550n;
        InputStream inputStream = null;
        parcelFileDescriptorOpenFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
        inputStream = null;
        InputStream inputStream2 = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        parcelFileDescriptorOpenFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = null;
        Closeable closeable2 = null;
        if (z10) {
            Bitmap bitmap4 = this.f538b;
            int i12 = this.f554r;
            ?? OpenOutputStream = this.f555s;
            ?? r11 = this.f552p;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap4, i12, (int) OpenOutputStream, (int) r11, this.f553q);
            Context context2 = weakReference.get();
            Bitmap.CompressFormat compressFormat = this.f545i;
            try {
                if (context2 != null) {
                    try {
                        OpenOutputStream = context2.getContentResolver().openOutputStream(uri2);
                    } catch (IOException e10) {
                        e = e10;
                        OpenOutputStream = 0;
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        closeable = null;
                        bg.a.a(closeable2);
                        bg.a.a(closeable);
                        throw th;
                    }
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            bitmapCreateBitmap2.compress(compressFormat, this.f546j, byteArrayOutputStream);
                            OpenOutputStream.write(byteArrayOutputStream.toByteArray());
                            bitmapCreateBitmap2.recycle();
                            OpenOutputStream = OpenOutputStream;
                            r11 = byteArrayOutputStream;
                        } catch (IOException e11) {
                            e = e11;
                            Log.e("BitmapCropTask", e.getLocalizedMessage());
                            OpenOutputStream = OpenOutputStream;
                            r11 = byteArrayOutputStream;
                            bg.a.a(OpenOutputStream);
                            bg.a.a(r11);
                            if (compressFormat.equals(Bitmap.CompressFormat.JPEG)) {
                            }
                        }
                    } catch (IOException e12) {
                        e = e12;
                        byteArrayOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        r11 = 0;
                        closeable2 = OpenOutputStream;
                        closeable = r11;
                        bg.a.a(closeable2);
                        bg.a.a(closeable);
                        throw th;
                    }
                    bg.a.a(OpenOutputStream);
                    bg.a.a(r11);
                }
                if (compressFormat.equals(Bitmap.CompressFormat.JPEG)) {
                    return;
                }
                boolean z12 = uri != null && "content".equals(uri.getScheme());
                if (uri2 != null && "content".equals(uri2.getScheme())) {
                    z11 = true;
                }
                if (z12 && z11) {
                    int i13 = this.f552p;
                    int i14 = this.f553q;
                    byte[] bArr = e.f4221b;
                    try {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        } catch (IOException e13) {
                            Log.d("ImageHeaderParser", e13.getMessage(), e13);
                        }
                        try {
                            a5.b bVar = new a5.b(inputStreamOpenInputStream);
                            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri2, "rw");
                            e.a(bVar, new a5.b(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), i13, i14);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e14) {
                                Log.d("ImageHeaderParser", e14.getMessage(), e14);
                            }
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (IOException e15) {
                            e = e15;
                            parcelFileDescriptor2 = parcelFileDescriptorOpenFileDescriptor;
                            inputStream2 = inputStreamOpenInputStream;
                            try {
                                Log.d("ImageHeaderParser", e.getMessage(), e);
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException e16) {
                                        Log.d("ImageHeaderParser", e16.getMessage(), e16);
                                    }
                                }
                                if (parcelFileDescriptor2 != null) {
                                    parcelFileDescriptor2.close();
                                    return;
                                }
                                return;
                            } catch (Throwable th5) {
                                parcelFileDescriptor = parcelFileDescriptor2;
                                th2 = th5;
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException e17) {
                                        Log.d("ImageHeaderParser", e17.getMessage(), e17);
                                    }
                                }
                                if (parcelFileDescriptor != null) {
                                    throw th2;
                                }
                                try {
                                    parcelFileDescriptor.close();
                                    throw th2;
                                } catch (IOException e18) {
                                    Log.d("ImageHeaderParser", e18.getMessage(), e18);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                            inputStream2 = inputStreamOpenInputStream;
                            if (inputStream2 != null) {
                            }
                            if (parcelFileDescriptor != null) {
                            }
                        }
                    } catch (IOException e19) {
                        e = e19;
                        parcelFileDescriptor2 = null;
                    } catch (Throwable th7) {
                        th2 = th7;
                        parcelFileDescriptor = null;
                    }
                    return;
                }
                String str = this.f548l;
                if (z12) {
                    int i15 = this.f552p;
                    int i16 = this.f553q;
                    byte[] bArr2 = e.f4221b;
                    try {
                        try {
                            inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
                            e.a(new a5.b(inputStreamOpenInputStream2), new a5.b(str), i15, i16);
                        } catch (IOException e20) {
                            Log.d("ImageHeaderParser", e20.getMessage(), e20);
                            if (inputStreamOpenInputStream2 == null) {
                                return;
                            }
                        }
                        try {
                            inputStreamOpenInputStream2.close();
                        } catch (IOException e21) {
                            Log.d("ImageHeaderParser", e21.getMessage(), e21);
                        }
                    } finally {
                    }
                } else {
                    String str2 = this.f547k;
                    if (!z11) {
                        a5.b bVar2 = new a5.b(str2);
                        int i17 = this.f552p;
                        int i18 = this.f553q;
                        byte[] bArr3 = e.f4221b;
                        try {
                            e.a(bVar2, new a5.b(str), i17, i18);
                            return;
                        } catch (IOException e22) {
                            Log.d("ImageHeaderParser", e22.getMessage());
                            return;
                        }
                    }
                    a5.b bVar3 = new a5.b(str2);
                    int i19 = this.f552p;
                    int i20 = this.f553q;
                    byte[] bArr4 = e.f4221b;
                    try {
                        try {
                            parcelFileDescriptorOpenFileDescriptor2 = context.getContentResolver().openFileDescriptor(uri2, "rw");
                            e.a(bVar3, new a5.b(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor()), i19, i20);
                        } catch (IOException e23) {
                            Log.d("ImageHeaderParser", e23.getMessage());
                            if (parcelFileDescriptorOpenFileDescriptor2 == null) {
                                return;
                            }
                        }
                        try {
                            parcelFileDescriptorOpenFileDescriptor2.close();
                        } catch (IOException e24) {
                            Log.d("ImageHeaderParser", e24.getMessage(), e24);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } else {
            if (uri.equals(uri2)) {
                return;
            }
            try {
                InputStream inputStreamOpenInputStream3 = context.getContentResolver().openInputStream(uri);
                try {
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri2);
                    if (!(inputStreamOpenInputStream3 instanceof FileInputStream) || !(outputStreamOpenOutputStream instanceof FileOutputStream)) {
                        throw new IllegalArgumentException("The input or output URI don't represent a file. uCrop requires then to represent files in order to work properly.");
                    }
                    FileChannel channel = ((FileInputStream) inputStreamOpenInputStream3).getChannel();
                    channel.transferTo(0L, channel.size(), ((FileOutputStream) outputStreamOpenOutputStream).getChannel());
                    inputStreamOpenInputStream3.close();
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th9) {
                    th = th9;
                    outputStream = null;
                    inputStream = inputStreamOpenInputStream3;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th10) {
                th = th10;
                outputStream = null;
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Throwable doInBackground(Void[] voidArr) {
        Bitmap bitmap = this.f538b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f540d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        if (this.f550n == null) {
            return new NullPointerException("ImageOutputUri is null");
        }
        try {
            a();
            this.f538b = null;
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Throwable th2) {
        Throwable th3 = th2;
        yf.a aVar = this.f551o;
        if (aVar != null) {
            if (th3 != null) {
                aVar.a(th3);
                return;
            }
            Uri uriFromFile = this.f550n;
            if (uriFromFile == null || !"content".equals(uriFromFile.getScheme())) {
                uriFromFile = Uri.fromFile(new File(this.f548l));
            }
            aVar.b(uriFromFile);
        }
    }
}
