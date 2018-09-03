function errorDemo() {
    try {
        throw "Throwing error for demo purpose";
    }
    catch (e) {
        console.log("Got following error :\n" + e);
    }
    finally {
        console.log("This block will be executed irrespective of anything");
    }
}

errorDemo();