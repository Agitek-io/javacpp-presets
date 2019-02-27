// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.QtWidgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.qt.QtCore.*;
import static org.bytedeco.qt.global.QtCore.*;
import org.bytedeco.qt.QtGui.*;
import static org.bytedeco.qt.global.QtGui.*;

import static org.bytedeco.qt.global.QtWidgets.*;

// Parsed from QtWidgets/qdialog.h

@Properties(inherit = org.bytedeco.qt.presets.QtWidgets.class)
public class QDialog extends QWidget {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QDialog(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QDialog(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QDialog position(long position) {
        return (QDialog)super.position(position);
    }

    public QDialog(QWidget parent/*=nullptr*/, @ByVal(nullValue = "Qt::WindowFlags()") @Cast("Qt::WindowFlags") int f) { super((Pointer)null); allocate(parent, f); }
    private native void allocate(QWidget parent/*=nullptr*/, @ByVal(nullValue = "Qt::WindowFlags()") @Cast("Qt::WindowFlags") int f);
    public QDialog() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** enum QDialog::DialogCode */
    public static final int Rejected = 0, Accepted = 1;

    public native int result();

    public native void setVisible(@Cast("bool") boolean visible);

    public native void setOrientation(Orientation orientation);
    public native Orientation orientation();

    public native void setExtension(QWidget extension);
    public native QWidget extension();

    public native @ByVal QSize sizeHint();
    public native @ByVal QSize minimumSizeHint();

    public native void setSizeGripEnabled(@Cast("bool") boolean arg0);
    public native @Cast("bool") boolean isSizeGripEnabled();

    public native void setModal(@Cast("bool") boolean modal);
    public native void setResult(int r);
    public native void open();
    public native int exec();
    public native void done(int arg0);
    public native void accept();
    public native void reject();

    public native void showExtension(@Cast("bool") boolean arg0);
}