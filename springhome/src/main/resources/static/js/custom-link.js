/*
    링크 비활성화 또는 확인창 띄우는 라이브러리
*/

window.addEventListener("load", function(){
    //.link-disabled에 해당하는 모든 링크의 기본 이벤트 차단
    //- 이벤트 처리 함수에는 첫 번째 매개변수로 이벤트 정보가 전달
    var disableList = document.querySelectorAll(".link-disabled");

    for(var i = 0; i < disableList.length; i++) {
        disableList[i].addEventListener("click", function(e){ //이름은 다른 것이어도 상관없다.
            // console.log(e);
            e.preventDefault(); //기본 이벤트 차단 명령
            // return false; //작동하지 않음
        });
    }

    var confirmList = document.querySelectorAll(".link-confirm");

    for(var i = 0; i < confirmList.length; i ++){
        confirmList[i].addEventListener("click", function(e){

            var message = this.dataset.message || "정말 이동하시겠습니까?"; //앞에 거 없으면 뒤에 거 불러와
            var choice = window.confirm(message);
            if(choice == false) {
                e.preventDefault();
            }
        });
    }
});