// Uploading and cropping images

var img1 = new SimpleImage("duvall.jpg");
var img2 = new SimpleImage("astrachan.jpg");

var width = img1.getWidth();
var heigth = img1.getHeight();

var croppedImage = crop(img2,width,heigth);

var oldPix = img1.getPixel(0,0);
var oldRed = oldPix.getRed();
var oldGreen = oldPix.getGreen();
var oldBlue = oldPix.getBlue();

print(oldRed);
print(oldGreen);
print(oldBlue);

print(img1);
print(croppedImage);

print(croppedImage.getHeight());

function crop(img, width, height){
    
    var croppedImg = new SimpleImage(width,height);
    
    for(var pixel of img.values()){
    
        var x = pixel.getX();
        var y = pixel.getY();
        
        if(x < width && y < height){
        
            croppedImg.setPixel(x,y,pixel);
            
        }
    }
    
    return croppedImg;
}


function getMostSig(value){
    
    var result = Math.floor(value/16)*16;
    return result;
    
}

function chop2Hide(image){
    
    for (var pixel of image.values()){
        
        var x = pixel.getX();
        var y = pixel.getY();
        
        var red = getMostSig(pixel.getRed());
        var green = getMostSig(pixel.getGreen());
        var blue = getMostSig(pixel.getBlue());
        
        pixel.setRed(red);
        pixel.setGreen(green);
        pixel.setBlue(blue);
        
    }
    
    return image;
    
}

function shift(image){
    
        for (var pixel of image.values()){
        
        var x = pixel.getX();
        var y = pixel.getY();
        
        var red = pixel.getRed()/16;
        var green = pixel.getGreen()/16;
        var blue = pixel.getBlue()/16;
        
        
        pixel.setRed(red);
        pixel.setGreen(green);
        pixel.setBlue(blue);
        
    }
    
    return image;
    
}


var showImage = chop2Hide(img1);

var showPix = showImage.getPixel(0,0);
var showRed = showPix.getRed();
var showGreen = showPix.getGreen();
var showBlue = showPix.getBlue();

print(showRed);
print(showGreen);
print(showBlue);

var hideImage = shift(croppedImage);

print(showImage);
print(hideImage);

function combine(show,hide){
    
    var combinedImg = new SimpleImage(show.getWidth(),show.getHeight());
    
    for (var pixel of combinedImg.values()){
        
        var x = pixel.getX();
        var y = pixel.getY();
        
        pixel.setRed(show.getPixel(x,y).getRed()+hide.getPixel(x,y).getRed());
        pixel.setGreen(show.getPixel(x,y).getGreen()+hide.getPixel(x,y).getGreen());
        pixel.setBlue(show.getPixel(x,y).getBlue()+hide.getPixel(x,y).getBlue());
        
    }
    
    return combinedImg;
    
}

var combinedImg = combine(showImage,hideImage);
print(combinedImg);

var combPix = combinedImg.getPixel(0,0);
var combR = combPix.getRed();
var combG = combPix.getGreen();
var combB = combPix.getBlue();

print(combR);
print(combG);
print(combB);

var newPix = hideImage.getPixel(0,0);
var newRed = newPix.getRed();
var newGreen = newPix.getGreen();
var newBlue = newPix.getBlue();

print(newRed);
print(newGreen);
print(newBlue);


