        $(function(){
            //페이지에 버튼이 포함되어 있으므로 DOM탐색으로 처리
            //[1] 첫페이지만 빼고 다 숨김
            $(".page").hide().first().show(); //ac페이지 숨기고 처음만 보여주세요
            $(".btn-prev").first().remove();
            $(".btn-next").last().remove();

            //[2] 다음 버튼을 누르면 버튼이 속한 페이지를 숨기고 뒷 페이지 표시
            $(".btn-next").click(function(){
                $(this).parents(".page").hide().next(".page").show(); //지금 버튼을 숨기고 다음 버튼을 보여주세요
            });

            //[3] 이전 버튼을 누르면 버튼이 속한 페이지를 숨기고 앞 페이지 표시
            $(".btn-prev").click(function(){
                $(this).parents(".page").hide().prev(".page").show();
            });

        });