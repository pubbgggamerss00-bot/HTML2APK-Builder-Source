package com.basitce.htmltoapk.data.apkgenerator;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.media.ExifInterface;
import b.o;
import c2.u;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.r;
import mh.x;
import pg.n;

/* loaded from: classes.dex */
public final class IconGenerator {
    public static final int $stable = 0;
    private static final String DEFAULT_BACKGROUND_COLOR = "#2196F3";
    private static final int ICON_SIZE = 1024;
    public static final IconGenerator INSTANCE = new IconGenerator();

    public static final class StyledIconResult {
        public static final int $stable = 8;
        private final String backgroundColorHex;
        private final File backgroundIcon;
        private final File circleIcon;
        private final File foregroundIcon;
        private final File squareIcon;

        public StyledIconResult(File foregroundIcon, File backgroundIcon, File squareIcon, File circleIcon, String backgroundColorHex) {
            r.e(foregroundIcon, "foregroundIcon");
            r.e(backgroundIcon, "backgroundIcon");
            r.e(squareIcon, "squareIcon");
            r.e(circleIcon, "circleIcon");
            r.e(backgroundColorHex, "backgroundColorHex");
            this.foregroundIcon = foregroundIcon;
            this.backgroundIcon = backgroundIcon;
            this.squareIcon = squareIcon;
            this.circleIcon = circleIcon;
            this.backgroundColorHex = backgroundColorHex;
        }

        public static /* synthetic */ StyledIconResult copy$default(StyledIconResult styledIconResult, File file, File file2, File file3, File file4, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                file = styledIconResult.foregroundIcon;
            }
            if ((i10 & 2) != 0) {
                file2 = styledIconResult.backgroundIcon;
            }
            if ((i10 & 4) != 0) {
                file3 = styledIconResult.squareIcon;
            }
            if ((i10 & 8) != 0) {
                file4 = styledIconResult.circleIcon;
            }
            if ((i10 & 16) != 0) {
                str = styledIconResult.backgroundColorHex;
            }
            String str2 = str;
            File file5 = file3;
            return styledIconResult.copy(file, file2, file5, file4, str2);
        }

        public final File component1() {
            return this.foregroundIcon;
        }

        public final File component2() {
            return this.backgroundIcon;
        }

        public final File component3() {
            return this.squareIcon;
        }

        public final File component4() {
            return this.circleIcon;
        }

        public final String component5() {
            return this.backgroundColorHex;
        }

        public final StyledIconResult copy(File foregroundIcon, File backgroundIcon, File squareIcon, File circleIcon, String backgroundColorHex) {
            r.e(foregroundIcon, "foregroundIcon");
            r.e(backgroundIcon, "backgroundIcon");
            r.e(squareIcon, "squareIcon");
            r.e(circleIcon, "circleIcon");
            r.e(backgroundColorHex, "backgroundColorHex");
            return new StyledIconResult(foregroundIcon, backgroundIcon, squareIcon, circleIcon, backgroundColorHex);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StyledIconResult)) {
                return false;
            }
            StyledIconResult styledIconResult = (StyledIconResult) obj;
            return r.a(this.foregroundIcon, styledIconResult.foregroundIcon) && r.a(this.backgroundIcon, styledIconResult.backgroundIcon) && r.a(this.squareIcon, styledIconResult.squareIcon) && r.a(this.circleIcon, styledIconResult.circleIcon) && r.a(this.backgroundColorHex, styledIconResult.backgroundColorHex);
        }

        public final String getBackgroundColorHex() {
            return this.backgroundColorHex;
        }

        public final File getBackgroundIcon() {
            return this.backgroundIcon;
        }

        public final File getCircleIcon() {
            return this.circleIcon;
        }

        public final File getForegroundIcon() {
            return this.foregroundIcon;
        }

        public final File getSquareIcon() {
            return this.squareIcon;
        }

        public int hashCode() {
            return this.backgroundColorHex.hashCode() + ((this.circleIcon.hashCode() + ((this.squareIcon.hashCode() + ((this.backgroundIcon.hashCode() + (this.foregroundIcon.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            File file = this.foregroundIcon;
            File file2 = this.backgroundIcon;
            File file3 = this.squareIcon;
            File file4 = this.circleIcon;
            String str = this.backgroundColorHex;
            StringBuilder sb = new StringBuilder("StyledIconResult(foregroundIcon=");
            sb.append(file);
            sb.append(", backgroundIcon=");
            sb.append(file2);
            sb.append(", squareIcon=");
            sb.append(file3);
            sb.append(", circleIcon=");
            sb.append(file4);
            sb.append(", backgroundColorHex=");
            return o.a(sb, str, ")");
        }
    }

    private IconGenerator() {
    }

    public static /* synthetic */ StyledIconResult createFullStyledIconFiles$default(IconGenerator iconGenerator, File file, File file2, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return iconGenerator.createFullStyledIconFiles(file, file2, str);
    }

    private final Bitmap decodeSampled(File file, int i10) {
        int attributeInt;
        Matrix matrix;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            return null;
        }
        int i11 = 1;
        while (Math.max(options.outWidth, options.outHeight) / i11 > i10 * 2) {
            i11 *= 2;
        }
        String absolutePath = file.getAbsolutePath();
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = i11;
        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options2);
        if (bitmapDecodeFile == null) {
            return null;
        }
        try {
            attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 1);
            matrix = new Matrix();
        } catch (Exception unused) {
        }
        if (attributeInt == 2) {
            matrix.postScale(-1.0f, 1.0f);
        } else if (attributeInt == 3) {
            matrix.postRotate(180.0f);
        } else if (attributeInt == 4) {
            matrix.postScale(1.0f, -1.0f);
        } else if (attributeInt == 6) {
            matrix.postRotate(90.0f);
        } else {
            if (attributeInt != 8) {
                return bitmapDecodeFile;
            }
            matrix.postRotate(270.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
        r.d(bitmapCreateBitmap, "createBitmap(...)");
        if (!bitmapCreateBitmap.equals(bitmapDecodeFile)) {
            bitmapDecodeFile.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap toRoundedCornerBitmap$default(IconGenerator iconGenerator, Bitmap bitmap, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.12f;
        }
        return iconGenerator.toRoundedCornerBitmap(bitmap, f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[Catch: Exception -> 0x0058, TRY_ENTER, TryCatch #4 {Exception -> 0x0058, blocks: (B:3:0x0020, B:5:0x0026, B:7:0x003c, B:9:0x0054, B:12:0x005e, B:14:0x0085, B:16:0x008b, B:18:0x0091, B:24:0x009d, B:35:0x00fe, B:34:0x00b3), top: B:104:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0214 A[Catch: Exception -> 0x028e, TryCatch #1 {Exception -> 0x028e, blocks: (B:50:0x01e5, B:52:0x020b, B:54:0x0214, B:55:0x0217, B:57:0x023d, B:59:0x0246, B:60:0x0249, B:66:0x025e, B:67:0x0261, B:72:0x0266, B:73:0x0269, B:79:0x0273, B:80:0x0276, B:85:0x027d, B:86:0x0280, B:88:0x0283, B:89:0x028d, B:51:0x0208, B:70:0x0264, B:47:0x01d7, B:77:0x0271, B:45:0x0182, B:56:0x023a, B:83:0x027b, B:64:0x025c), top: B:99:0x0024, inners: #0, #2, #5, #7, #8, #9, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0246 A[Catch: Exception -> 0x028e, TryCatch #1 {Exception -> 0x028e, blocks: (B:50:0x01e5, B:52:0x020b, B:54:0x0214, B:55:0x0217, B:57:0x023d, B:59:0x0246, B:60:0x0249, B:66:0x025e, B:67:0x0261, B:72:0x0266, B:73:0x0269, B:79:0x0273, B:80:0x0276, B:85:0x027d, B:86:0x0280, B:88:0x0283, B:89:0x028d, B:51:0x0208, B:70:0x0264, B:47:0x01d7, B:77:0x0271, B:45:0x0182, B:56:0x023a, B:83:0x027b, B:64:0x025c), top: B:99:0x0024, inners: #0, #2, #5, #7, #8, #9, #10, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StyledIconResult createFullStyledIconFiles(File source, File tempDir, String str) throws IOException {
        String str2;
        Bitmap bitmapDecodeSampled;
        String str3;
        int color;
        Bitmap roundedCornerBitmap;
        Bitmap circleBitmap;
        r.e(source, "source");
        r.e(tempDir, "tempDir");
        try {
            bitmapDecodeSampled = decodeSampled(source, 1024);
        } catch (Exception unused) {
            str2 = "#FFFFFF";
        }
        if (bitmapDecodeSampled == null) {
            throw new IllegalStateException("Cannot decode source icon");
        }
        int iMin = Math.min(bitmapDecodeSampled.getWidth(), bitmapDecodeSampled.getHeight());
        if (bitmapDecodeSampled.getWidth() != bitmapDecodeSampled.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeSampled, (bitmapDecodeSampled.getWidth() - iMin) / 2, (bitmapDecodeSampled.getHeight() - iMin) / 2, iMin, iMin);
            if (!r.a(bitmapCreateBitmap, bitmapDecodeSampled)) {
                bitmapDecodeSampled.recycle();
            }
            bitmapDecodeSampled = bitmapCreateBitmap;
        }
        r.b(bitmapDecodeSampled);
        int width = bitmapDecodeSampled.getWidth();
        int height = bitmapDecodeSampled.getHeight();
        int pixel = bitmapDecodeSampled.getPixel(0, 0);
        int i10 = width - 1;
        int pixel2 = bitmapDecodeSampled.getPixel(i10, 0);
        int i11 = height - 1;
        int pixel3 = bitmapDecodeSampled.getPixel(0, i11);
        int pixel4 = bitmapDecodeSampled.getPixel(i10, i11);
        boolean z10 = Color.alpha(pixel) < 32 || Color.alpha(pixel2) < 32 || Color.alpha(pixel3) < 32 || Color.alpha(pixel4) < 32;
        if (str != null) {
            str3 = !x.A(str) ? str : null;
            if (str3 == null) {
            }
            if (z10) {
            }
            String str4 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & color)}, 1));
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(1024, 1024, config);
            r.d(bitmapCreateBitmap2, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            str2 = "#FFFFFF";
            Paint paint = new Paint(3);
            paint.setDither(true);
            int i12 = (int) (1024 * (!z10 ? 0.72f : 0.76f));
            int i13 = (1024 - i12) / 2;
            int i14 = i13 + i12;
            canvas.drawBitmap(bitmapDecodeSampled, new Rect(0, 0, bitmapDecodeSampled.getWidth(), bitmapDecodeSampled.getHeight()), new Rect(i13, i13, i14, i14), paint);
            File file = new File(tempDir, "icon_fg_" + System.currentTimeMillis() + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            bitmapCreateBitmap2.compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.close();
            bitmapCreateBitmap2.recycle();
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(1024, 1024, config);
            r.d(bitmapCreateBitmap3, "createBitmap(...)");
            Canvas canvas2 = new Canvas(bitmapCreateBitmap3);
            Paint paint2 = new Paint(1);
            paint2.setColor(color);
            paint2.setStyle(Paint.Style.FILL);
            canvas2.drawRect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1024.0f, 1024.0f, paint2);
            File file2 = new File(tempDir, "icon_bg_" + System.currentTimeMillis() + ".png");
            fileOutputStream = new FileOutputStream(file2);
            bitmapCreateBitmap3.compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.close();
            bitmapCreateBitmap3.recycle();
            roundedCornerBitmap = toRoundedCornerBitmap(bitmapDecodeSampled, 0.12f);
            File file3 = new File(tempDir, "icon_square_" + System.currentTimeMillis() + ".png");
            fileOutputStream = new FileOutputStream(file3);
            roundedCornerBitmap.compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.close();
            if (!roundedCornerBitmap.equals(bitmapDecodeSampled)) {
            }
            circleBitmap = toCircleBitmap(bitmapDecodeSampled);
            File file4 = new File(tempDir, "icon_circle_" + System.currentTimeMillis() + ".png");
            fileOutputStream = new FileOutputStream(file4);
            circleBitmap.compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.close();
            if (!circleBitmap.equals(bitmapDecodeSampled)) {
            }
            bitmapDecodeSampled.recycle();
            return new StyledIconResult(file, file2, file3, file4, str4);
        }
        str3 = "#FFFFFF";
        if (z10) {
            color = Color.rgb((((Color.red(pixel) + Color.red(pixel2)) + Color.red(pixel3)) + Color.red(pixel4)) / 4, (((Color.green(pixel) + Color.green(pixel2)) + Color.green(pixel3)) + Color.green(pixel4)) / 4, (((Color.blue(pixel) + Color.blue(pixel2)) + Color.blue(pixel3)) + Color.blue(pixel4)) / 4);
        } else {
            try {
                color = Color.parseColor(str3);
            } catch (Exception unused2) {
                color = -1;
            }
        }
        String str42 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & color)}, 1));
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap22 = Bitmap.createBitmap(1024, 1024, config2);
        r.d(bitmapCreateBitmap22, "createBitmap(...)");
        Canvas canvas3 = new Canvas(bitmapCreateBitmap22);
        str2 = "#FFFFFF";
        try {
            Paint paint3 = new Paint(3);
            paint3.setDither(true);
            int i122 = (int) (1024 * (!z10 ? 0.72f : 0.76f));
            int i132 = (1024 - i122) / 2;
            try {
                int i142 = i132 + i122;
                canvas3.drawBitmap(bitmapDecodeSampled, new Rect(0, 0, bitmapDecodeSampled.getWidth(), bitmapDecodeSampled.getHeight()), new Rect(i132, i132, i142, i142), paint3);
                File file5 = new File(tempDir, "icon_fg_" + System.currentTimeMillis() + ".png");
                FileOutputStream fileOutputStream2 = new FileOutputStream(file5);
                try {
                    Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
                    bitmapCreateBitmap22.compress(compressFormat2, 100, fileOutputStream2);
                    fileOutputStream2.close();
                    bitmapCreateBitmap22.recycle();
                    Bitmap bitmapCreateBitmap32 = Bitmap.createBitmap(1024, 1024, config2);
                    r.d(bitmapCreateBitmap32, "createBitmap(...)");
                    Canvas canvas22 = new Canvas(bitmapCreateBitmap32);
                    Paint paint22 = new Paint(1);
                    paint22.setColor(color);
                    paint22.setStyle(Paint.Style.FILL);
                    canvas22.drawRect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1024.0f, 1024.0f, paint22);
                    File file22 = new File(tempDir, "icon_bg_" + System.currentTimeMillis() + ".png");
                    fileOutputStream2 = new FileOutputStream(file22);
                    try {
                        bitmapCreateBitmap32.compress(compressFormat2, 100, fileOutputStream2);
                        fileOutputStream2.close();
                        bitmapCreateBitmap32.recycle();
                        roundedCornerBitmap = toRoundedCornerBitmap(bitmapDecodeSampled, 0.12f);
                        File file32 = new File(tempDir, "icon_square_" + System.currentTimeMillis() + ".png");
                        fileOutputStream2 = new FileOutputStream(file32);
                        try {
                            roundedCornerBitmap.compress(compressFormat2, 100, fileOutputStream2);
                            fileOutputStream2.close();
                            if (!roundedCornerBitmap.equals(bitmapDecodeSampled)) {
                                roundedCornerBitmap.recycle();
                            }
                            circleBitmap = toCircleBitmap(bitmapDecodeSampled);
                            File file42 = new File(tempDir, "icon_circle_" + System.currentTimeMillis() + ".png");
                            fileOutputStream2 = new FileOutputStream(file42);
                            try {
                                circleBitmap.compress(compressFormat2, 100, fileOutputStream2);
                                fileOutputStream2.close();
                                if (!circleBitmap.equals(bitmapDecodeSampled)) {
                                    circleBitmap.recycle();
                                }
                                bitmapDecodeSampled.recycle();
                                return new StyledIconResult(file5, file22, file32, file42, str42);
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
        }
        return new StyledIconResult(source, source, source, source, str == null ? str2 : str);
    }

    public final n<File, File> createStyledIconFiles(File source, File tempDir) throws IOException {
        r.e(source, "source");
        r.e(tempDir, "tempDir");
        StyledIconResult styledIconResultCreateFullStyledIconFiles = createFullStyledIconFiles(source, tempDir, null);
        return new n<>(styledIconResultCreateFullStyledIconFiles.getSquareIcon(), styledIconResultCreateFullStyledIconFiles.getCircleIcon());
    }

    public final String extractDisplayGlyph(String text) {
        Character chValueOf;
        r.e(text, "text");
        String string = x.W(text).toString();
        if (string.length() == 0) {
            return "A";
        }
        int i10 = 0;
        while (true) {
            if (i10 >= string.length()) {
                chValueOf = null;
                break;
            }
            char cCharAt = string.charAt(i10);
            if (Character.isLetterOrDigit(cCharAt)) {
                chValueOf = Character.valueOf(cCharAt);
                break;
            }
            i10++;
        }
        if (chValueOf != null) {
            return String.valueOf(Character.toUpperCase(chValueOf.charValue()));
        }
        try {
            String strSubstring = string.substring(0, Character.charCount(string.codePointAt(0)));
            r.d(strSubstring, "substring(...)");
            return strSubstring;
        } catch (Exception unused) {
            return "A";
        }
    }

    public final File generateDefaultIcon(Context context, String appName, String str) throws IOException {
        int color;
        r.e(context, "context");
        r.e(appName, "appName");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1024, 1024, Bitmap.Config.ARGB_8888);
        r.d(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (str == null) {
            str = DEFAULT_BACKGROUND_COLOR;
        }
        try {
            color = Color.parseColor(str);
        } catch (Exception unused) {
            color = Color.parseColor(DEFAULT_BACKGROUND_COLOR);
        }
        Paint paint = new Paint(1);
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        float f10 = 1024;
        float f11 = 0.2f * f10;
        canvas.drawRoundRect(new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, f10), f11, f11, paint);
        try {
            try {
                String strExtractDisplayGlyph = extractDisplayGlyph(appName);
                Paint paint2 = new Paint(1);
                paint2.setColor(-1);
                paint2.setTextSize(f10 * 0.45f);
                paint2.setTypeface(Typeface.DEFAULT_BOLD);
                paint2.setTextAlign(Paint.Align.CENTER);
                float f12 = f10 / 2.0f;
                canvas.drawText(strExtractDisplayGlyph, f12, f12 - ((paint2.descent() + paint2.ascent()) / 2.0f), paint2);
            } catch (Exception unused2) {
                Paint paint3 = new Paint(1);
                paint3.setColor(-1);
                paint3.setTextSize(0.45f * f10);
                paint3.setTypeface(Typeface.DEFAULT_BOLD);
                paint3.setTextAlign(Paint.Align.CENTER);
                float f13 = f10 / 2.0f;
                canvas.drawText("A", f13, f13 - ((paint3.descent() + paint3.ascent()) / 2.0f), paint3);
            }
        } catch (Exception unused3) {
        }
        File file = new File(context.getCacheDir(), "generated_icons");
        file.mkdirs();
        File file2 = new File(file, u.a("default_icon_", ".png", System.currentTimeMillis()));
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            bitmapCreateBitmap.recycle();
            return file2;
        } finally {
        }
    }

    public final void scaleTo(File source, int i10, File output) throws IOException {
        int i11;
        r.e(source, "source");
        r.e(output, "output");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(source.getAbsolutePath(), options);
        int i12 = options.outWidth;
        if (i12 <= 0 || (i11 = options.outHeight) <= 0) {
            throw new IllegalArgumentException(m3.a.a("Cannot decode icon dimensions: ", source.getAbsolutePath()));
        }
        int iMax = Math.max(i12, i11);
        int i13 = 1;
        while (true) {
            int i14 = i13 * 2;
            if (iMax / i14 < i10 || iMax / i13 <= 2048) {
                break;
            } else {
                i13 = i14;
            }
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = i13;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        options2.inPreferredConfig = config;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(source.getAbsolutePath(), options2);
        if (bitmapDecodeFile == null) {
            throw new IllegalArgumentException(m3.a.a("Cannot decode icon: ", source.getAbsolutePath()));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, config);
        r.d(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        paint.setDither(true);
        float f10 = i10;
        canvas.drawBitmap(bitmapDecodeFile, (Rect) null, new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, f10), paint);
        if (!bitmapDecodeFile.equals(bitmapCreateBitmap)) {
            bitmapDecodeFile.recycle();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(output);
        try {
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            bitmapCreateBitmap.recycle();
        } finally {
        }
    }

    public final Bitmap toCircleBitmap(Bitmap src) {
        r.e(src, "src");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(src.getWidth(), src.getHeight(), Bitmap.Config.ARGB_8888);
        r.d(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        paint.setDither(true);
        float width = src.getWidth() / 2.0f;
        canvas.drawCircle(width, width, width, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(src, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, paint);
        return bitmapCreateBitmap;
    }

    public final Bitmap toRoundedCornerBitmap(Bitmap src, float f10) {
        r.e(src, "src");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(src.getWidth(), src.getHeight(), Bitmap.Config.ARGB_8888);
        r.d(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        paint.setDither(true);
        float width = src.getWidth() * f10;
        canvas.drawRoundRect(new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, src.getWidth(), src.getHeight()), width, width, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(src, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, paint);
        return bitmapCreateBitmap;
    }
}
